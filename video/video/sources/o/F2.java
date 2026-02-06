package o;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes3.dex */
public abstract class F2 extends AbstractC10696xN1 {
    @Override // o.AbstractC10696xN1
    public int b(int i) {
        return JN1.j(r().nextInt(), i);
    }

    @Override // o.AbstractC10696xN1
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // o.AbstractC10696xN1
    @NotNull
    public byte[] e(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "array");
        r().nextBytes(bArr);
        return bArr;
    }

    @Override // o.AbstractC10696xN1
    public double h() {
        return r().nextDouble();
    }

    @Override // o.AbstractC10696xN1
    public float k() {
        return r().nextFloat();
    }

    @Override // o.AbstractC10696xN1
    public int l() {
        return r().nextInt();
    }

    @Override // o.AbstractC10696xN1
    public int m(int i) {
        return r().nextInt(i);
    }

    @Override // o.AbstractC10696xN1
    public long o() {
        return r().nextLong();
    }

    @NotNull
    public abstract Random r();
}
