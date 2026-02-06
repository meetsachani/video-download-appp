package o;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: o.ju0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7391ju0 implements InterfaceC4382Tz0 {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    /* renamed from: o.ju0$a */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnDrawListener {
        public final /* synthetic */ View X;

        /* renamed from: o.ju0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0296a implements Runnable {
            public final /* synthetic */ ViewTreeObserver.OnDrawListener X;

            public RunnableC0296a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.X = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5770dG0.c().i();
                C7391ju0.this.b = true;
                C7391ju0.b(a.this.X, this.X);
                C7391ju0.this.a.clear();
            }
        }

        public a(View view) {
            this.X = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            SD2.z(new RunnableC0296a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // o.InterfaceC4382Tz0
    public void a(Activity activity) {
        if (this.b || !this.a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
    }
}
