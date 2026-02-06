package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Deprecated
/* renamed from: o.Wa2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4581Wa2 extends AbstractC4193Sa2 {
    public static final Parcelable.Creator<C4581Wa2> CREATOR = new a();
    public final List<c> X;

    /* renamed from: o.Wa2$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C4581Wa2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4581Wa2 createFromParcel(Parcel parcel) {
            return new C4581Wa2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4581Wa2[] newArray(int i) {
            return new C4581Wa2[i];
        }
    }

    /* renamed from: o.Wa2$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final int a;
        public final long b;

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public /* synthetic */ C4581Wa2(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static C4581Wa2 a(C3012Fy1 c3012Fy1) {
        int L = c3012Fy1.L();
        ArrayList arrayList = new ArrayList(L);
        for (int i = 0; i < L; i++) {
            arrayList.add(c.e(c3012Fy1));
        }
        return new C4581Wa2(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.X.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.X.get(i2).f(parcel);
        }
    }

    public C4581Wa2(List<c> list) {
        this.X = Collections.unmodifiableList(list);
    }

    public C4581Wa2(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.d(parcel));
        }
        this.X = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: o.Wa2$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        public c(long j, boolean z, boolean z2, boolean z3, List<b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(C3012Fy1 c3012Fy1) {
            boolean z;
            ArrayList arrayList;
            boolean z2;
            boolean z3;
            long j;
            boolean z4;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z5;
            boolean z6;
            boolean z7;
            long j3;
            boolean z8;
            long j4;
            boolean z9;
            long N = c3012Fy1.N();
            boolean z10 = true;
            if ((c3012Fy1.L() & 128) != 0) {
                z = true;
            } else {
                z = true;
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z10) {
                int L = c3012Fy1.L();
                if ((L & 128) != 0) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                if ((L & 64) != 0) {
                    z6 = z;
                } else {
                    z6 = false;
                }
                if ((L & 32) != 0) {
                    z7 = z;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = c3012Fy1.N();
                } else {
                    j3 = C10323vs.b;
                }
                if (!z6) {
                    int L2 = c3012Fy1.L();
                    ArrayList arrayList3 = new ArrayList(L2);
                    int i4 = 0;
                    while (i4 < L2) {
                        arrayList3.add(new b(c3012Fy1.L(), c3012Fy1.N(), null));
                        i4++;
                        L2 = L2;
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long L3 = c3012Fy1.L();
                    if ((128 & L3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((L3 & 1) << 32) | c3012Fy1.N()) * 1000) / 90;
                    z8 = z9;
                } else {
                    z8 = false;
                    j4 = C10323vs.b;
                }
                int R = c3012Fy1.R();
                int L4 = c3012Fy1.L();
                boolean z11 = z5;
                z4 = z8;
                z2 = z11;
                i3 = c3012Fy1.L();
                long j5 = j3;
                i = R;
                i2 = L4;
                long j6 = j4;
                arrayList = arrayList2;
                z3 = z6;
                j = j5;
                j2 = j6;
            } else {
                arrayList = arrayList2;
                z2 = false;
                z3 = false;
                j = C10323vs.b;
                z4 = false;
                j2 = C10323vs.b;
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            return new c(N, z10, z2, z3, arrayList, j, z4, j2, i, i2, i3);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f.get(i).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(b.c(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}
