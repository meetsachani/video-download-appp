package o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.No1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3759No1 implements androidx.appcompat.view.menu.j {
    public AbstractC3661Mo1 X;
    public boolean Y = false;
    public int Z;

    /* renamed from: o.No1$a */
    /* loaded from: classes3.dex */
    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0215a();
        public int X;
        @InterfaceC11300zs1
        public C2511Ay1 Y;

        /* renamed from: o.No1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0215a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: a */
            public a createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: b */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            parcel.writeInt(this.X);
            parcel.writeParcelable(this.Y, 0);
        }

        public a(@InterfaceC5670cr1 Parcel parcel) {
            this.X = parcel.readInt();
            this.Y = (C2511Ay1) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void b(int i) {
        this.Z = i;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(@InterfaceC11300zs1 androidx.appcompat.view.menu.e eVar, @InterfaceC11300zs1 androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(@InterfaceC5670cr1 Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.X.w(aVar.X);
            this.X.t(C2849Ek.h(this.X.getContext(), aVar.Y));
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(@InterfaceC11300zs1 androidx.appcompat.view.menu.m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.k g(@InterfaceC11300zs1 ViewGroup viewGroup) {
        return this.X;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.Z;
    }

    @Override // androidx.appcompat.view.menu.j
    @InterfaceC5670cr1
    public Parcelable h() {
        a aVar = new a();
        aVar.X = this.X.getSelectedItemId();
        aVar.Y = C2849Ek.i(this.X.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(boolean z) {
        if (this.Y) {
            return;
        }
        if (z) {
            this.X.d();
        } else {
            this.X.y();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(@InterfaceC11300zs1 androidx.appcompat.view.menu.e eVar, @InterfaceC11300zs1 androidx.appcompat.view.menu.h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void l(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 androidx.appcompat.view.menu.e eVar) {
        this.X.c(eVar);
    }

    public void m(@InterfaceC5670cr1 AbstractC3661Mo1 abstractC3661Mo1) {
        this.X = abstractC3661Mo1;
    }

    public void n(boolean z) {
        this.Y = z;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(@InterfaceC11300zs1 j.a aVar) {
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(@InterfaceC11300zs1 androidx.appcompat.view.menu.e eVar, boolean z) {
    }
}
