package o;

import android.app.Activity;
import android.graphics.Bitmap;
import o.H80;

/* loaded from: classes3.dex */
public class I80 {
    public static final H80.f e = new a();
    public static final H80.e f = new b();
    @InterfaceC4698Xf2
    public final int a;
    @InterfaceC5670cr1
    public final H80.f b;
    @InterfaceC5670cr1
    public final H80.e c;
    @InterfaceC11300zs1
    public Integer d;

    /* loaded from: classes3.dex */
    public class a implements H80.f {
        @Override // o.H80.f
        public boolean a(@InterfaceC5670cr1 Activity activity, int i) {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {
        @InterfaceC4698Xf2
        public int a;
        @InterfaceC5670cr1
        public H80.f b = I80.e;
        @InterfaceC5670cr1
        public H80.e c = I80.f;
        @InterfaceC11300zs1
        public Bitmap d;
        @InterfaceC11300zs1
        public Integer e;

        @InterfaceC5670cr1
        public I80 f() {
            return new I80(this, null);
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c g(@JF int i) {
            this.d = null;
            this.e = Integer.valueOf(i);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c h(@InterfaceC5670cr1 Bitmap bitmap) {
            this.d = bitmap;
            this.e = null;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c i(@InterfaceC5670cr1 H80.e eVar) {
            this.c = eVar;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c j(@InterfaceC5670cr1 H80.f fVar) {
            this.b = fVar;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public c k(@InterfaceC4698Xf2 int i) {
            this.a = i;
            return this;
        }
    }

    public /* synthetic */ I80(c cVar, a aVar) {
        this(cVar);
    }

    public static int c(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return NY1.a(C7258jL1.a(iArr, 128)).get(0).intValue();
    }

    @InterfaceC11300zs1
    public Integer d() {
        return this.d;
    }

    @InterfaceC5670cr1
    public H80.e e() {
        return this.c;
    }

    @InterfaceC5670cr1
    public H80.f f() {
        return this.b;
    }

    @InterfaceC4698Xf2
    public int g() {
        return this.a;
    }

    public I80(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        if (cVar.e != null) {
            this.d = cVar.e;
        } else if (cVar.d != null) {
            this.d = Integer.valueOf(c(cVar.d));
        }
    }

    /* loaded from: classes3.dex */
    public class b implements H80.e {
        @Override // o.H80.e
        public void a(@InterfaceC5670cr1 Activity activity) {
        }
    }
}
