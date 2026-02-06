package o;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,718:1\n1#2:719\n*E\n"})
/* renamed from: o.x12  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10609x12 implements Externalizable {
    public static final int Y0 = 0;
    @NotNull
    public static final a Z = new a(null);
    public static final int Z0 = 1;
    private static final long serialVersionUID = 0;
    @NotNull
    public Collection<?> X;
    public final int Y;

    /* renamed from: o.x12$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C10609x12(@NotNull Collection<?> collection, int i) {
        C6562gT0.p(collection, "collection");
        this.X = collection;
        this.Y = i;
    }

    private final Object readResolve() {
        return this.X;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) {
        List a2;
        C6562gT0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i != 0) {
                    if (i == 1) {
                        Set e = A22.e(readInt);
                        while (i2 < readInt) {
                            e.add(objectInput.readObject());
                            i2++;
                        }
                        a2 = A22.a(e);
                    } else {
                        throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
                    }
                } else {
                    List j = C7979mF.j(readInt);
                    while (i2 < readInt) {
                        j.add(objectInput.readObject());
                        i2++;
                    }
                    a2 = C7979mF.a(j);
                }
                this.X = a2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) {
        C6562gT0.p(objectOutput, "output");
        objectOutput.writeByte(this.Y);
        objectOutput.writeInt(this.X.size());
        Iterator<?> it = this.X.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public C10609x12() {
        this(C8222nF.H(), 0);
    }
}
