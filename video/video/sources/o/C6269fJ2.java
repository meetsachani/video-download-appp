package o;

import android.content.Context;
import java.io.File;
import o.X30;

/* renamed from: o.fJ2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6269fJ2 {
    public static final String a = "volley";

    /* renamed from: o.fJ2$a */
    /* loaded from: classes.dex */
    public class a implements X30.d {
        public File a = null;
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // o.X30.d
        public File get() {
            if (this.a == null) {
                this.a = new File(this.b.getCacheDir(), C6269fJ2.a);
            }
            return this.a;
        }
    }

    public static C9006qS1 a(Context context) {
        return b(context, null);
    }

    public static C9006qS1 b(Context context, AbstractC7112il abstractC7112il) {
        C5406bm c5406bm;
        if (abstractC7112il == null) {
            c5406bm = new C5406bm((AbstractC7112il) new II0());
        } else {
            c5406bm = new C5406bm(abstractC7112il);
        }
        return d(context, c5406bm);
    }

    @Deprecated
    public static C9006qS1 c(Context context, EI0 ei0) {
        if (ei0 == null) {
            return b(context, null);
        }
        return d(context, new C5406bm(ei0));
    }

    public static C9006qS1 d(Context context, InterfaceC11045yp1 interfaceC11045yp1) {
        C9006qS1 c9006qS1 = new C9006qS1(new X30(new a(context.getApplicationContext())), interfaceC11045yp1);
        c9006qS1.o();
        return c9006qS1;
    }
}
