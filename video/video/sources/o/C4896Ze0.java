package o;

import com.google.firebase.sessions.settings.RemoteSettings;

@Deprecated
/* renamed from: o.Ze0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4896Ze0 {
    public final C3816Oe0[] a;
    public final long[] b;
    public final String c;
    public final String d;
    public final long e;

    public C4896Ze0(String str, String str2, long j, long[] jArr, C3816Oe0[] c3816Oe0Arr) {
        this.c = str;
        this.d = str2;
        this.e = j;
        this.b = jArr;
        this.a = c3816Oe0Arr;
    }

    public String a() {
        return this.c + RemoteSettings.i + this.d;
    }
}
