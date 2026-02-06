package o;

import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: o.uT0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9987uT0 {
    public final Set<LiveData> a = Collections.newSetFromMap(new IdentityHashMap());
    public final VU1 b;

    public C9987uT0(VU1 vu1) {
        this.b = vu1;
    }

    public <T> LiveData<T> a(String[] strArr, boolean z, Callable<T> callable) {
        return new androidx.room.e(this.b, this, z, callable, strArr);
    }

    public void b(LiveData liveData) {
        this.a.add(liveData);
    }

    public void c(LiveData liveData) {
        this.a.remove(liveData);
    }
}
