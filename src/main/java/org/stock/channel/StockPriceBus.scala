package org.stock.channel

import akka.actor.ActorRef
import akka.event.{LookupClassification, EventBus}

/**
 * Created by User: Administrator at Date: 2014/11/5 Time: 10:18
 */

case class StockPrice(stockId: Long, price:Double);

class StockPriceBus extends EventBus with LookupClassification{
  override type Event = StockPrice
  override type Classifier = Int
  override type Subscriber = ActorRef

  override def mapSize = 1


  override def publish(event: Event, subscriber:Subscriber): Unit = {
    subscriber ! event;
  }

  override protected def compareSubscribers(a: Subscriber, b: Subscriber): Int = a.compareTo(b)

  //default all to one classifier
  override protected def classify(event: Event): Classifier = 0
}
