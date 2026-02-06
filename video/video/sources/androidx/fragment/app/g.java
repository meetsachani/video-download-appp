package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import o.C9070qk;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public ArrayList<String> X;
    public ArrayList<String> Y;
    public int Y0;
    public b[] Z;
    public String Z0;
    public ArrayList<String> a1;
    public ArrayList<C9070qk> b1;
    public ArrayList<FragmentManager.n> c1;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    public g() {
        this.Z0 = null;
        this.a1 = new ArrayList<>();
        this.b1 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.X);
        parcel.writeStringList(this.Y);
        parcel.writeTypedArray(this.Z, i);
        parcel.writeInt(this.Y0);
        parcel.writeString(this.Z0);
        parcel.writeStringList(this.a1);
        parcel.writeTypedList(this.b1);
        parcel.writeTypedList(this.c1);
    }

    public g(Parcel parcel) {
        this.Z0 = null;
        this.a1 = new ArrayList<>();
        this.b1 = new ArrayList<>();
        this.X = parcel.createStringArrayList();
        this.Y = parcel.createStringArrayList();
        this.Z = (b[]) parcel.createTypedArray(b.CREATOR);
        this.Y0 = parcel.readInt();
        this.Z0 = parcel.readString();
        this.a1 = parcel.createStringArrayList();
        this.b1 = parcel.createTypedArrayList(C9070qk.CREATOR);
        this.c1 = parcel.createTypedArrayList(FragmentManager.n.CREATOR);
    }
}
