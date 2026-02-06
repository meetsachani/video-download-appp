package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import o.C3771Nr1;
import o.C6562gT0;
import o.C7458kA2;
import o.W12;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class ExchangeFinder {
    @NotNull
    private final Address address;
    @NotNull
    private final RealCall call;
    @NotNull
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    @NotNull
    private final EventListener eventListener;
    @Nullable
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    @Nullable
    private RouteSelector.Selection routeSelection;
    @Nullable
    private RouteSelector routeSelector;

    public ExchangeFinder(@NotNull RealConnectionPool realConnectionPool, @NotNull Address address, @NotNull RealCall realCall, @NotNull EventListener eventListener) {
        C6562gT0.p(realConnectionPool, "connectionPool");
        C6562gT0.p(address, "address");
        C6562gT0.p(realCall, C3771Nr1.E0);
        C6562gT0.p(eventListener, "eventListener");
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = realCall;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final RealConnection findConnection(int i, int i2, int i3, int i4, boolean z) throws IOException {
        List<Route> routes;
        Socket releaseConnectionNoEvents$okhttp;
        if (!this.call.isCanceled()) {
            RealConnection connection = this.call.getConnection();
            if (connection != null) {
                synchronized (connection) {
                    try {
                        if (!connection.getNoNewExchanges() && sameHostAndPort(connection.route().address().url())) {
                            releaseConnectionNoEvents$okhttp = null;
                            C7458kA2 c7458kA2 = C7458kA2.a;
                        }
                        releaseConnectionNoEvents$okhttp = this.call.releaseConnectionNoEvents$okhttp();
                        C7458kA2 c7458kA22 = C7458kA2.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.call.getConnection() != null) {
                    if (releaseConnectionNoEvents$okhttp == null) {
                        return connection;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                if (releaseConnectionNoEvents$okhttp != null) {
                    Util.closeQuietly(releaseConnectionNoEvents$okhttp);
                }
                this.eventListener.connectionReleased(this.call, connection);
            }
            this.refusedStreamCount = 0;
            this.connectionShutdownCount = 0;
            this.otherFailureCount = 0;
            if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
                RealConnection connection2 = this.call.getConnection();
                C6562gT0.m(connection2);
                this.eventListener.connectionAcquired(this.call, connection2);
                return connection2;
            }
            Route route = this.nextRouteToTry;
            try {
                if (route != null) {
                    C6562gT0.m(route);
                    this.nextRouteToTry = null;
                } else {
                    RouteSelector.Selection selection = this.routeSelection;
                    if (selection != null) {
                        C6562gT0.m(selection);
                        if (selection.hasNext()) {
                            RouteSelector.Selection selection2 = this.routeSelection;
                            C6562gT0.m(selection2);
                            route = selection2.next();
                        }
                    }
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector == null) {
                        routeSelector = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                        this.routeSelector = routeSelector;
                    }
                    RouteSelector.Selection next = routeSelector.next();
                    this.routeSelection = next;
                    routes = next.getRoutes();
                    if (!this.call.isCanceled()) {
                        if (this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, false)) {
                            RealConnection connection3 = this.call.getConnection();
                            C6562gT0.m(connection3);
                            this.eventListener.connectionAcquired(this.call, connection3);
                            return connection3;
                        }
                        route = next.next();
                        RealConnection realConnection = new RealConnection(this.connectionPool, route);
                        this.call.setConnectionToCancel(realConnection);
                        realConnection.connect(i, i2, i3, i4, z, this.call, this.eventListener);
                        this.call.setConnectionToCancel(null);
                        this.call.getClient().getRouteDatabase().connected(realConnection.route());
                        if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                            RealConnection connection4 = this.call.getConnection();
                            C6562gT0.m(connection4);
                            this.nextRouteToTry = route;
                            Util.closeQuietly(realConnection.socket());
                            this.eventListener.connectionAcquired(this.call, connection4);
                            return connection4;
                        }
                        synchronized (realConnection) {
                            this.connectionPool.put(realConnection);
                            this.call.acquireConnectionNoEvents(realConnection);
                            C7458kA2 c7458kA23 = C7458kA2.a;
                        }
                        this.eventListener.connectionAcquired(this.call, realConnection);
                        return realConnection;
                    }
                    throw new IOException("Canceled");
                }
                realConnection.connect(i, i2, i3, i4, z, this.call, this.eventListener);
                this.call.setConnectionToCancel(null);
                this.call.getClient().getRouteDatabase().connected(realConnection.route());
                if (!this.connectionPool.callAcquirePooledConnection(this.address, this.call, routes, true)) {
                }
            } catch (Throwable th2) {
                this.call.setConnectionToCancel(null);
                throw th2;
            }
            routes = null;
            RealConnection realConnection2 = new RealConnection(this.connectionPool, route);
            this.call.setConnectionToCancel(realConnection2);
        } else {
            throw new IOException("Canceled");
        }
    }

    private final RealConnection findHealthyConnection(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        boolean z3;
        while (true) {
            RealConnection findConnection = findConnection(i, i2, i3, i4, z);
            boolean z4 = z;
            int i5 = i4;
            int i6 = i3;
            int i7 = i2;
            int i8 = i;
            if (findConnection.isHealthy(z2)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean z5 = true;
                if (selection != null) {
                    z3 = selection.hasNext();
                } else {
                    z3 = true;
                }
                if (z3) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector != null) {
                        z5 = routeSelector.hasNext();
                    }
                    if (!z5) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i = i8;
            i2 = i7;
            i3 = i6;
            i4 = i5;
            z = z4;
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!Util.canReuseConnectionFor(connection.route().address().url(), this.address.url())) {
                return null;
            }
            return connection.route();
        }
    }

    @NotNull
    public final ExchangeCodec find(@NotNull OkHttpClient okHttpClient, @NotNull RealInterceptorChain realInterceptorChain) {
        C6562gT0.p(okHttpClient, "client");
        C6562gT0.p(realInterceptorChain, "chain");
        try {
            try {
                return findHealthyConnection(realInterceptorChain.getConnectTimeoutMillis$okhttp(), realInterceptorChain.getReadTimeoutMillis$okhttp(), realInterceptorChain.getWriteTimeoutMillis$okhttp(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), !C6562gT0.g(realInterceptorChain.getRequest$okhttp().method(), "GET")).newCodec$okhttp(okHttpClient, realInterceptorChain);
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                trackFailure(iOException);
                throw new RouteException(iOException);
            } catch (RouteException e2) {
                e = e2;
                RouteException routeException = e;
                trackFailure(routeException.getLastConnectException());
                throw routeException;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (RouteException e4) {
            e = e4;
        }
    }

    @NotNull
    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection != null && selection.hasNext()) || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(@NotNull HttpUrl httpUrl) {
        C6562gT0.p(httpUrl, "url");
        HttpUrl url = this.address.url();
        if (httpUrl.port() == url.port() && C6562gT0.g(httpUrl.host(), url.host())) {
            return true;
        }
        return false;
    }

    public final void trackFailure(@NotNull IOException iOException) {
        C6562gT0.p(iOException, W12.i);
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
