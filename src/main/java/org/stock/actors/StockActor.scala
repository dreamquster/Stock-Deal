package org.stock.actors

import akka.actor.Actor
import org.stock.channel.StockPrice

/**
 * Created by User: Administrator at Date: 2014/11/5 Time: 13:43
 */
class StockActor extends Actor{

  var lastMsg:StockPrice = new StockPrice(0, 0)

  override def receive = {
    case StockPrice(stockId, price) =>
      println(s"recieve a stock:$stockId with a price:$price");
      lastMsg = new StockPrice(stockId, price)


  }

  def lastMessage() = lastMsg

}
