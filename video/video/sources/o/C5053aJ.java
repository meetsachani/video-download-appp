package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.aJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5053aJ<T> extends AbstractC10587ww1<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<? super T>[] Z;

    public C5053aJ(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.Z = new Comparator[]{comparator, comparator2};
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.Z;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5053aJ) {
            return Arrays.equals(this.Z, ((C5053aJ) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.Z);
    }

    public String toString() {
        String arrays = Arrays.toString(this.Z);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb.append("Ordering.compound(");
        sb.append(arrays);
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public C5053aJ(Iterable<? extends Comparator<? super T>> iterable) {
        this.Z = (Comparator[]) C5098aU0.R(iterable, new Comparator[0]);
    }
}
