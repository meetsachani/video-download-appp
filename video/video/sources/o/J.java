package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class J implements Parcelable {
    public final Parcelable X;
    public static final J Y = new a();
    public static final Parcelable.Creator<J> CREATOR = new b();

    /* loaded from: classes.dex */
    public class a extends J {
        public a() {
            super((a) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator<J> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public J createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public J createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return J.Y;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public J[] newArray(int i) {
            return new J[i];
        }
    }

    public /* synthetic */ J(a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.X, i);
    }

    public J() {
        this.X = null;
    }

    public J(Parcelable parcelable) {
        if (parcelable != null) {
            this.X = parcelable == Y ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public J(Parcel parcel) {
        this(parcel, null);
    }

    public J(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.X = readParcelable == null ? Y : readParcelable;
    }
}
