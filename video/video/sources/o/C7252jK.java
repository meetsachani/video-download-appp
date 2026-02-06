package o;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* renamed from: o.jK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7252jK {
    public final boolean a;
    @InterfaceC11300zs1
    public final String b;
    @InterfaceC11300zs1
    public final C6525gK c;

    /* renamed from: o.jK$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public boolean a;
        @InterfaceC11300zs1
        public String b;
        @InterfaceC11300zs1
        public C6525gK c;

        @RecentlyNonNull
        public C7252jK a() {
            return new C7252jK(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public a b(@InterfaceC11300zs1 String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public a c(@InterfaceC11300zs1 C6525gK c6525gK) {
            this.c = c6525gK;
            return this;
        }

        @RecentlyNonNull
        public a d(boolean z) {
            this.a = z;
            return this;
        }
    }

    public /* synthetic */ C7252jK(a aVar, RS2 rs2) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
    }

    @RecentlyNullable
    public C6525gK a() {
        return this.c;
    }

    public boolean b() {
        return this.a;
    }

    @RecentlyNullable
    public final String c() {
        return this.b;
    }
}
