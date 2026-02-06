package o;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: o.gm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6633gm1<T> implements InterfaceC5675cs2<T> {
    public final Collection<? extends InterfaceC5675cs2<T>> c;

    @SafeVarargs
    public C6633gm1(InterfaceC5675cs2<T>... interfaceC5675cs2Arr) {
        if (interfaceC5675cs2Arr.length != 0) {
            this.c = Arrays.asList(interfaceC5675cs2Arr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // o.InterfaceC5675cs2
    public InterfaceC5580cT1<T> a(Context context, InterfaceC5580cT1<T> interfaceC5580cT1, int i, int i2) {
        InterfaceC5580cT1<T> interfaceC5580cT12 = interfaceC5580cT1;
        for (InterfaceC5675cs2<T> interfaceC5675cs2 : this.c) {
            InterfaceC5580cT1<T> a = interfaceC5675cs2.a(context, interfaceC5580cT12, i, i2);
            if (interfaceC5580cT12 != null && !interfaceC5580cT12.equals(interfaceC5580cT1) && !interfaceC5580cT12.equals(a)) {
                interfaceC5580cT12.a();
            }
            interfaceC5580cT12 = a;
        }
        return interfaceC5580cT12;
    }

    @Override // o.InterfaceC6575gX0
    public void b(MessageDigest messageDigest) {
        for (InterfaceC5675cs2<T> interfaceC5675cs2 : this.c) {
            interfaceC5675cs2.b(messageDigest);
        }
    }

    @Override // o.InterfaceC6575gX0
    public boolean equals(Object obj) {
        if (obj instanceof C6633gm1) {
            return this.c.equals(((C6633gm1) obj).c);
        }
        return false;
    }

    @Override // o.InterfaceC6575gX0
    public int hashCode() {
        return this.c.hashCode();
    }

    public C6633gm1(Collection<? extends InterfaceC5675cs2<T>> collection) {
        if (!collection.isEmpty()) {
            this.c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
}
