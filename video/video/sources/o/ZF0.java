package o;

import android.os.Handler;

/* loaded from: classes.dex */
public final class ZF0 {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final /* synthetic */ FA0<C7458kA2> X;

        public a(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Runnable {
        public final /* synthetic */ FA0<C7458kA2> X;

        public b(FA0<C7458kA2> fa0) {
            this.X = fa0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.X.invoke();
        }
    }

    public static final Runnable a(Handler handler, long j, Object obj, FA0<C7458kA2> fa0) {
        a aVar = new a(fa0);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    public static /* synthetic */ Runnable b(Handler handler, long j, Object obj, FA0 fa0, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        a aVar = new a(fa0);
        handler.postAtTime(aVar, obj, j);
        return aVar;
    }

    public static final Runnable c(Handler handler, long j, Object obj, FA0<C7458kA2> fa0) {
        b bVar = new b(fa0);
        if (obj == null) {
            handler.postDelayed(bVar, j);
            return bVar;
        }
        SF0.d(handler, bVar, obj, j);
        return bVar;
    }

    public static /* synthetic */ Runnable d(Handler handler, long j, Object obj, FA0 fa0, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        b bVar = new b(fa0);
        if (obj == null) {
            handler.postDelayed(bVar, j);
            return bVar;
        }
        SF0.d(handler, bVar, obj, j);
        return bVar;
    }
}
