package o;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C5587cV1;

/* renamed from: o.cV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5587cV1 {
    public final OrientationEventListener b;
    public final Object a = new Object();
    public final Map<b, c> c = new HashMap();
    public boolean d = false;

    /* renamed from: o.cV1$a */
    /* loaded from: classes.dex */
    public class a extends OrientationEventListener {
        public static final int c = -1;
        public int a;

        public a(Context context) {
            super(context);
            this.a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int b;
            ArrayList<c> arrayList;
            if (i != -1 && this.a != (b = C5587cV1.b(i))) {
                this.a = b;
                synchronized (C5587cV1.this.a) {
                    arrayList = new ArrayList(C5587cV1.this.c.values());
                }
                if (!arrayList.isEmpty()) {
                    for (c cVar : arrayList) {
                        cVar.c(b);
                    }
                }
            }
        }
    }

    /* renamed from: o.cV1$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i);
    }

    /* renamed from: o.cV1$c */
    /* loaded from: classes.dex */
    public static class c {
        public final b a;
        public final Executor b;
        public final AtomicBoolean c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.a = bVar;
            this.b = executor;
        }

        public static /* synthetic */ void a(c cVar, int i) {
            if (cVar.c.get()) {
                cVar.a.a(i);
            }
        }

        public void b() {
            this.c.set(false);
        }

        public void c(final int i) {
            this.b.execute(new Runnable() { // from class: o.dV1
                @Override // java.lang.Runnable
                public final void run() {
                    C5587cV1.c.a(C5587cV1.c.this, i);
                }
            });
        }
    }

    public C5587cV1(Context context) {
        this.b = new a(context);
    }

    public static int b(int i) {
        if (i < 315 && i >= 45) {
            if (i >= 225) {
                return 1;
            }
            if (i >= 135) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    public boolean a(Executor executor, b bVar) {
        synchronized (this.a) {
            try {
                if (!this.b.canDetectOrientation() && !this.d) {
                    return false;
                }
                this.c.put(bVar, new c(bVar, executor));
                this.b.enable();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.a) {
            try {
                c cVar = this.c.get(bVar);
                if (cVar != null) {
                    cVar.b();
                    this.c.remove(bVar);
                }
                if (this.c.isEmpty()) {
                    this.b.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
