package com.example.demo.core.utilities.results;

public class DataResult<A> extends Result {
    private A data;

    public DataResult(A data, boolean success, String message) {
        super(success, message);
        this.data=data;
    }
    public DataResult(A data, boolean success) {
        super(success);
        this.data=data;
    }

    public A getData() {
        return this.data;
    }
}
