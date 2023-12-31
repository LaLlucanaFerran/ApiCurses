package com.lallucana.API.Persentation.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ferran Castañé on 23/09/2023.
 * Interface for HTTP Observable
 * This interface is used to update requests to the server
 */
public interface HttpObservable {
    List<HttpObserver> httpObservers = new ArrayList<>();

    /**
     * Add http observer.
     *
     * @param httpObserver the http observer
     */
    default void addHttpObserver(HttpObserver httpObserver){
        this.httpObservers.add(httpObserver);
    }

    /**
     * Delete http observer.
     *
     * @param httpObserver the http observer
     */
    default void deleteHttpObserver(HttpObserver httpObserver){
        this.httpObservers.remove(httpObserver);
    }

    /**
     * Update http.
     *
     * @param genre the sex of the runners
     * @param number the number of runners
     */
    void updateHttp(String genre, Integer number);

    /**
     * Update compare runners
     * @param doss1 the dorsal of runner1
     * @param doss2 the dorsal of runner2
     * @param doss3 the dorsal
     */
    void updateHttpCompereRunners(Integer doss1, Integer doss2, Integer doss3);
}