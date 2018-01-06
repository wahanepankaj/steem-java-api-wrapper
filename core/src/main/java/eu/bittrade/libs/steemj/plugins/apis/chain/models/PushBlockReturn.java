package eu.bittrade.libs.steemj.plugins.apis.chain.models;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

/**
 * This class is the java implementation of the Steem "push_block_return"
 * object.
 * 
 * @author <a href="http://steemit.com/@dez1337">dez1337</a>
 */
public class PushBlockReturn {
    @JsonProperty("success")
    private boolean success;
    @JsonProperty("error")
    private String error;

    /**
     * This object is only used to wrap the JSON response in a POJO, so
     * therefore this class should not be instantiated.
     */
    private PushBlockReturn() {
    }

    /**
     * @return the success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return the error
     */
    public Optional<String> getError() {
        return Optional.fromNullable(error);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}