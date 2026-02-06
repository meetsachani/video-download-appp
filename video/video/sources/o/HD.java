package o;

import o.C2449Ai;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes2.dex */
public abstract class HD {

    @InterfaceC6615gi.a
    /* loaded from: classes2.dex */
    public static abstract class a {
        @InterfaceC5670cr1
        public abstract HD a();

        @InterfaceC5670cr1
        public abstract a b(@InterfaceC11300zs1 V8 v8);

        @InterfaceC5670cr1
        public abstract a c(@InterfaceC11300zs1 b bVar);
    }

    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        public final int X;

        b(int i) {
            this.X = i;
        }
    }

    @InterfaceC5670cr1
    public static a a() {
        return new C2449Ai.b();
    }

    @InterfaceC11300zs1
    public abstract V8 b();

    @InterfaceC11300zs1
    public abstract b c();
}
