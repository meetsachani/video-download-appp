package o;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import o.C3388Jt1;

/* renamed from: o.yp2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11046yp2 extends C3388Jt1.c {
    public volatile Instant a;
    public final Instant b;

    public C11046yp2() {
        Instant now;
        now = Instant.now();
        this.b = now;
    }

    @Override // o.C3388Jt1.c
    public void a() throws IOException {
        Instant now;
        now = Instant.now();
        this.a = now;
    }

    public Instant f() {
        return this.a;
    }

    public Instant g() {
        return this.b;
    }

    public Duration h() {
        Duration between;
        between = Duration.between(this.b, this.a);
        return between;
    }

    public Duration i() {
        Instant now;
        Duration between;
        Instant instant = this.b;
        now = Instant.now();
        between = Duration.between(instant, now);
        return between;
    }

    public boolean j() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "TimestampedObserver [openInstant=" + this.b + ", closeInstant=" + this.a + C6566gU0.g;
    }
}
