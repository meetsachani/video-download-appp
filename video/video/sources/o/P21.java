package o;

import android.location.LocationManager;
import java.util.concurrent.Callable;
import o.Q21;

/* loaded from: classes.dex */
public final /* synthetic */ class P21 implements Callable {
    public final /* synthetic */ LocationManager a;
    public final /* synthetic */ Q21.j b;

    public /* synthetic */ P21(LocationManager locationManager, Q21.j jVar) {
        this.a = locationManager;
        this.b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean valueOf;
        valueOf = Boolean.valueOf(this.a.addGpsStatusListener(this.b));
        return valueOf;
    }
}
