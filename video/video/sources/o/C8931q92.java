package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import o.C4224Si1;
import o.C8931q92;

@Deprecated
/* renamed from: o.q92  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8931q92 implements C4224Si1.b {
    public static final Parcelable.Creator<C8931q92> CREATOR = new a();
    public final List<b> X;

    /* renamed from: o.q92$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C8931q92> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8931q92 createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new C8931q92(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8931q92[] newArray(int i) {
            return new C8931q92[i];
        }
    }

    /* renamed from: o.q92$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable {
        public final long X;
        public final long Y;
        public final int Z;
        public static final Comparator<b> Y0 = new Comparator() { // from class: o.r92
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m;
                m = AbstractC9452sH.n().g(r1.X, r2.X).g(r1.Y, r2.Y).f(((C8931q92.b) obj).Z, ((C8931q92.b) obj2).Z).m();
                return m;
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o.q92$b$a */
        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.X = j;
            this.Y = j2;
            this.Z = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.X == bVar.X && this.Y == bVar.Y && this.Z == bVar.Z) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(Long.valueOf(this.X), Long.valueOf(this.Y), Integer.valueOf(this.Z));
        }

        public String toString() {
            return TD2.M("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.X), Long.valueOf(this.Y), Integer.valueOf(this.Z));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.X);
            parcel.writeLong(this.Y);
            parcel.writeInt(this.Z);
        }
    }

    public C8931q92(List<b> list) {
        this.X = list;
        C9542sf.a(!a(list));
    }

    public static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).Y;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).X < j) {
                return true;
            }
            j = list.get(i).Y;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8931q92.class == obj.getClass()) {
            return this.X.equals(((C8931q92) obj).X);
        }
        return false;
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.X;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.X);
    }
}
