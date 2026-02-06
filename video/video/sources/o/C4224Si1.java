package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import o.C11005yf1;

@Deprecated
/* renamed from: o.Si1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4224Si1 implements Parcelable {
    public static final Parcelable.Creator<C4224Si1> CREATOR = new a();
    public final b[] X;
    public final long Y;

    /* renamed from: o.Si1$a */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<C4224Si1> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4224Si1 createFromParcel(Parcel parcel) {
            return new C4224Si1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4224Si1[] newArray(int i) {
            return new C4224Si1[i];
        }
    }

    public C4224Si1(b... bVarArr) {
        this((long) C10323vs.b, bVarArr);
    }

    public C4224Si1 a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        return new C4224Si1(this.Y, (b[]) TD2.o1(this.X, bVarArr));
    }

    public C4224Si1 b(@InterfaceC11300zs1 C4224Si1 c4224Si1) {
        if (c4224Si1 == null) {
            return this;
        }
        return a(c4224Si1.X);
    }

    public C4224Si1 c(long j) {
        if (this.Y == j) {
            return this;
        }
        return new C4224Si1(j, this.X);
    }

    public b d(int i) {
        return this.X[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.X.length;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4224Si1.class == obj.getClass()) {
            C4224Si1 c4224Si1 = (C4224Si1) obj;
            if (Arrays.equals(this.X, c4224Si1.X) && this.Y == c4224Si1.Y) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.X) * 31) + C7194j51.k(this.Y);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.X));
        if (this.Y == C10323vs.b) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.Y;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.X.length);
        for (b bVar : this.X) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.Y);
    }

    public C4224Si1(long j, b... bVarArr) {
        this.Y = j;
        this.X = bVarArr;
    }

    public C4224Si1(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public C4224Si1(long j, List<? extends b> list) {
        this(j, (b[]) list.toArray(new b[0]));
    }

    public C4224Si1(Parcel parcel) {
        this.X = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.X;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                this.Y = parcel.readLong();
                return;
            }
        }
    }

    /* renamed from: o.Si1$b */
    /* loaded from: classes2.dex */
    public interface b extends Parcelable {
        @InterfaceC11300zs1
        default C10833xx0 j() {
            return null;
        }

        @InterfaceC11300zs1
        default byte[] y0() {
            return null;
        }

        default void r(C11005yf1.b bVar) {
        }
    }
}
