package o;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes.dex */
public final class X41 {
    public final long a;
    public final long b;

    public X41(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public double c() {
        return this.a / this.b;
    }

    public String toString() {
        return this.a + RemoteSettings.i + this.b;
    }

    public X41(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
