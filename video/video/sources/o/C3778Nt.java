package o;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import o.C5208ax0;
import o.C5935dx0;

/* renamed from: o.Nt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3778Nt {
    public final C5935dx0.d a;
    public final Executor b;

    /* renamed from: o.Nt$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ C5935dx0.d X;
        public final /* synthetic */ Typeface Y;

        public a(C5935dx0.d dVar, Typeface typeface) {
            this.X = dVar;
            this.Y = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.b(this.Y);
        }
    }

    /* renamed from: o.Nt$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ C5935dx0.d X;
        public final /* synthetic */ int Y;

        public b(C5935dx0.d dVar, int i) {
            this.X = dVar;
            this.Y = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.Y);
        }
    }

    public C3778Nt(C5935dx0.d dVar, Executor executor) {
        this.a = dVar;
        this.b = executor;
    }

    public final void a(int i) {
        this.b.execute(new b(this.a, i));
    }

    public void b(C5208ax0.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.execute(new a(this.a, typeface));
    }

    public C3778Nt(C5935dx0.d dVar) {
        this(dVar, C6559gS1.b(C4266St.a()));
    }
}
