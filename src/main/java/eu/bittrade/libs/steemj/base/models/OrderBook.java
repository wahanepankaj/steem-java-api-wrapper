package eu.bittrade.libs.steemj.base.models;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * This class represents a Steem "order_book" object.
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class OrderBook {
    private List<Order> asks;
    private List<Order> bids;

    public List<Order> getAsks() {
        return asks;
    }

    public List<Order> getBids() {
        return bids;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
