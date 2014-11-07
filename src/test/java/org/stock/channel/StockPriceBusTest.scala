package org.stock.channel

import akka.actor.{Props, ActorSystem}
import akka.testkit.{TestActorRef, TestKit}
import org.scalatest.{MustMatchers, WordSpecLike}
import org.stock.actors.StockActor

/**
 * Created by User: Administrator at Date: 2014/11/5 Time: 12:34
 */
class StockPriceBusTest extends TestKit(ActorSystem("channel-test"))
  with WordSpecLike
  with MustMatchers{

  "One sender send a stock price to N reciever" in {
    val priceBus = new StockPriceBus();
    var stockActors = for (i <- Range(0, 4)) yield {
      val stockActor = TestActorRef[StockActor];
      priceBus.subscribe(stockActor, 0)
      stockActor
    }



    priceBus.publish(StockPrice(1, 2.4));
    for (stockActor <- stockActors) {
      stockActor.underlyingActor.lastMessage() must be(StockPrice(1, 2.4))
    }
  }


}
