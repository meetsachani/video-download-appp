package o;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.z12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11095z12 implements Externalizable {
    @NotNull
    public static final a Y = new a(null);
    private static final long serialVersionUID = 0;
    @NotNull
    public Map<?, ?> X;

    /* renamed from: o.z12$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C11095z12(@NotNull Map<?, ?> map) {
        C6562gT0.p(map, "map");
        this.X = map;
    }

    private final Object readResolve() {
        return this.X;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        C6562gT0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map h = C8683p81.h(readInt);
                for (int i = 0; i < readInt; i++) {
                    h.put(objectInput.readObject(), objectInput.readObject());
                }
                this.X = C8683p81.d(h);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C6562gT0.p(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.X.size());
        for (Map.Entry<?, ?> entry : this.X.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public C11095z12() {
        this(C8926q81.z());
    }
}
