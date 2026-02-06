package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.Gr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3084Gr {
    public static final Comparator<byte[]> e = new a();
    public final List<byte[]> a = new ArrayList();
    public final List<byte[]> b = new ArrayList(64);
    public int c = 0;
    public final int d;

    /* renamed from: o.Gr$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C3084Gr(int i) {
        this.d = i;
    }

    public synchronized byte[] a(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = this.b.get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.d) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += bArr.length;
                c();
            }
        }
    }

    public final synchronized void c() {
        while (this.c > this.d) {
            byte[] remove = this.a.remove(0);
            this.b.remove(remove);
            this.c -= remove.length;
        }
    }
}
