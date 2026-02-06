package o;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.jetbrains.annotations.NotNull;

@InterfaceC6365fj0
/* renamed from: o.mE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7978mE2 implements Externalizable {
    @NotNull
    public static final a Z = new a(null);
    private static final long serialVersionUID = 0;
    public long X;
    public long Y;

    /* renamed from: o.mE2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C7978mE2(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }

    private final Object readResolve() {
        return C6990iE2.Z.b(this.X, this.Y);
    }

    public final long a() {
        return this.Y;
    }

    public final long b() {
        return this.X;
    }

    public final void c(long j) {
        this.Y = j;
    }

    public final void d(long j) {
        this.X = j;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        C6562gT0.p(objectInput, "input");
        this.X = objectInput.readLong();
        this.Y = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C6562gT0.p(objectOutput, "output");
        objectOutput.writeLong(this.X);
        objectOutput.writeLong(this.Y);
    }

    public C7978mE2() {
        this(0L, 0L);
    }
}
