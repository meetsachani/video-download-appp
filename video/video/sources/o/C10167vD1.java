package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.vD1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10167vD1 extends F2 {
    @Override // o.AbstractC10696xN1
    public double i(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // o.AbstractC10696xN1
    public int n(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // o.AbstractC10696xN1
    public long p(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // o.AbstractC10696xN1
    public long q(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // o.F2
    @NotNull
    public Random r() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C6562gT0.o(current, "current(...)");
        return current;
    }
}
