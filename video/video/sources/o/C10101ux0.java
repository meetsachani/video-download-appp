package o;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.ux0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10101ux0 {
    public final int a;
    public final String b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.ux0$a */
    /* loaded from: classes3.dex */
    public @interface a {
        public static final int t1 = 1;
        public static final int u1 = 2;
        public static final int v1 = 3;
        public static final int w1 = 4;
    }

    public C10101ux0(int i, @RecentlyNonNull String str) {
        this.a = i;
        this.b = str;
    }

    public int a() {
        return this.a;
    }

    @RecentlyNonNull
    public String b() {
        return this.b;
    }
}
