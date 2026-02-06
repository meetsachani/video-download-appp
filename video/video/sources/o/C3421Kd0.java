package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import org.jetbrains.annotations.NotNull;

@InterfaceC6480g82(version = "1.8")
/* renamed from: o.Kd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3421Kd0<T extends Enum<T>> extends AbstractC8896q1<T> implements InterfaceC3127Hd0<T>, Serializable {
    @NotNull
    public final T[] Z;

    public C3421Kd0(@NotNull T[] tArr) {
        C6562gT0.p(tArr, RemoteConfigConstants.ResponseFieldKey.h0);
        this.Z = tArr;
    }

    private final Object writeReplace() {
        return new C3519Ld0(this.Z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return h((Enum) obj);
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.Z.length;
    }

    public boolean h(@NotNull T t) {
        C6562gT0.p(t, "element");
        if (((Enum) C7330jf.Ye(this.Z, t.ordinal())) == t) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC8896q1, java.util.List
    @NotNull
    /* renamed from: i */
    public T get(int i) {
        AbstractC8896q1.X.b(i, this.Z.length);
        return this.Z[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return j((Enum) obj);
    }

    public int j(@NotNull T t) {
        C6562gT0.p(t, "element");
        int ordinal = t.ordinal();
        if (((Enum) C7330jf.Ye(this.Z, ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    public int k(@NotNull T t) {
        C6562gT0.p(t, "element");
        return indexOf(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return k((Enum) obj);
    }
}
