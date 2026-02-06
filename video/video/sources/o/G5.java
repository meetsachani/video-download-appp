package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class G5 implements Parcelable {
    public final int X;
    public final Intent Y;
    public static final b Z = new b(null);
    public static final Parcelable.Creator<G5> CREATOR = new a();

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<G5> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public G5 createFromParcel(Parcel parcel) {
            C6562gT0.p(parcel, "parcel");
            return new G5(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public G5[] newArray(int i) {
            return new G5[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final String b(int i) {
            if (i != -1) {
                if (i != 0) {
                    return String.valueOf(i);
                }
                return "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        public b() {
        }

        public static /* synthetic */ void a() {
        }
    }

    public G5(int i, Intent intent) {
        this.X = i;
        this.Y = intent;
    }

    @InterfaceC9511sW0
    public static final String c(int i) {
        return Z.b(i);
    }

    public final Intent a() {
        return this.Y;
    }

    public final int b() {
        return this.X;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + Z.b(this.X) + ", data=" + this.Y + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C6562gT0.p(parcel, "dest");
        parcel.writeInt(this.X);
        if (this.Y == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.Y;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G5(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        C6562gT0.p(parcel, "parcel");
    }
}
