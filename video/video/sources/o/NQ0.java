package o;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.jetbrains.annotations.NotNull;

@InterfaceC5395bj0
/* loaded from: classes3.dex */
public final class NQ0 implements Externalizable {
    @NotNull
    public static final a Z = new a(null);
    private static final long serialVersionUID = 0;
    public long X;
    public int Y;

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public NQ0(long j, int i) {
        this.X = j;
        this.Y = i;
    }

    private final Object readResolve() {
        return C11193zQ0.Z.b(this.X, this.Y);
    }

    public final long a() {
        return this.X;
    }

    public final int b() {
        return this.Y;
    }

    public final void c(long j) {
        this.X = j;
    }

    public final void d(int i) {
        this.Y = i;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        C6562gT0.p(objectInput, "input");
        this.X = objectInput.readLong();
        this.Y = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C6562gT0.p(objectOutput, "output");
        objectOutput.writeLong(this.X);
        objectOutput.writeInt(this.Y);
    }

    public NQ0() {
        this(0L, 0);
    }
}
