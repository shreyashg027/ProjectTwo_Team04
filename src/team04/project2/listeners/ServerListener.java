package team04.project2.listeners;

/**
 * A listener to notify changes in the model
 *
 * @author  David Henderson (dchende2@asu.edu)
 * @version 1.0
 * @since   2018-02-18
 */

public interface ServerListener {
    /**
     * Called when the server is started (and open for connections)
     */
    public void started();

    /**
     * Called when the server is stopped (and connections are closed)
     */
    public void shutdown();
}
