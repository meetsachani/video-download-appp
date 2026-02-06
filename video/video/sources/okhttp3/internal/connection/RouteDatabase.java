package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import o.C6562gT0;
import okhttp3.Route;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class RouteDatabase {
    @NotNull
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@NotNull Route route) {
        C6562gT0.p(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@NotNull Route route) {
        C6562gT0.p(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(@NotNull Route route) {
        C6562gT0.p(route, "route");
        return this.failedRoutes.contains(route);
    }
}
