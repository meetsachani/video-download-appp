package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public class IC1<E> implements Iterator<List<E>> {
    public final int[] X;
    public final Map<Integer, E> Y;
    public List<E> Y0;
    public final boolean[] Z;

    public IC1(Collection<? extends E> collection) {
        if (collection != null) {
            this.X = new int[collection.size()];
            boolean[] zArr = new boolean[collection.size()];
            this.Z = zArr;
            Arrays.fill(zArr, false);
            this.Y = new HashMap();
            int i = 1;
            for (E e : collection) {
                this.Y.put(Integer.valueOf(i), e);
                this.X[i - 1] = i;
                i++;
            }
            this.Y0 = new ArrayList(collection);
            return;
        }
        throw new NullPointerException("The collection must not be null");
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public List<E> next() {
        int[] iArr;
        boolean[] zArr;
        int i;
        if (hasNext()) {
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            while (true) {
                iArr = this.X;
                if (i4 >= iArr.length) {
                    break;
                }
                boolean z = this.Z[i4];
                if (((z && i4 < iArr.length - 1 && iArr[i4] > iArr[i4 + 1]) || (!z && i4 > 0 && iArr[i4] > iArr[i4 - 1])) && (i = iArr[i4]) > i5) {
                    i6 = i4;
                    i5 = i;
                }
                i4++;
            }
            if (i5 == -1) {
                List<E> list = this.Y0;
                this.Y0 = null;
                return list;
            }
            boolean[] zArr2 = this.Z;
            boolean z2 = zArr2[i6];
            if (z2) {
                i3 = 1;
            }
            int i7 = iArr[i6];
            int i8 = i3 + i6;
            iArr[i6] = iArr[i8];
            iArr[i8] = i7;
            zArr2[i6] = zArr2[i8];
            zArr2[i8] = z2;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int[] iArr2 = this.X;
                if (i2 < iArr2.length) {
                    int i9 = iArr2[i2];
                    if (i9 > i5) {
                        this.Z[i2] = !zArr[i2];
                    }
                    arrayList.add(this.Y.get(Integer.valueOf(i9)));
                    i2++;
                } else {
                    List<E> list2 = this.Y0;
                    this.Y0 = arrayList;
                    return list2;
                }
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y0 != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
