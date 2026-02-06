package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.ArrayList;
import java.util.List;
import o.C10907yF1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class b implements a.c {
    public static final int Y0 = 2;
    public static final int Z = 1;
    @InterfaceC5670cr1
    public final d X;
    @InterfaceC5670cr1
    public final List<a.c> Y;
    public static final d Z0 = new a();
    public static final d a1 = new C0125b();
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* loaded from: classes3.dex */
    public class a implements d {
        @Override // com.google.android.material.datepicker.b.d
        public boolean a(@InterfaceC5670cr1 List<a.c> list, long j) {
            for (a.c cVar : list) {
                if (cVar != null && cVar.M(j)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.b.d
        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0125b implements d {
        @Override // com.google.android.material.datepicker.b.d
        public boolean a(@InterfaceC5670cr1 List<a.c> list, long j) {
            for (a.c cVar : list) {
                if (cVar != null && !cVar.M(j)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.b.d
        public int getId() {
            return 2;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: a */
        public b createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
            d dVar;
            ArrayList readArrayList = parcel.readArrayList(a.c.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = b.a1;
            } else {
                dVar = readInt == 1 ? b.Z0 : b.a1;
            }
            return new b((List) C10907yF1.l(readArrayList), dVar, null);
        }

        @Override // android.os.Parcelable.Creator
        @InterfaceC5670cr1
        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        boolean a(@InterfaceC5670cr1 List<a.c> list, long j);

        int getId();
    }

    public /* synthetic */ b(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    @InterfaceC5670cr1
    public static a.c c(@InterfaceC5670cr1 List<a.c> list) {
        return new b(list, a1);
    }

    @InterfaceC5670cr1
    public static a.c d(@InterfaceC5670cr1 List<a.c> list) {
        return new b(list, Z0);
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean M(long j) {
        return this.X.a(this.Y, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.Y.equals(bVar.Y) && this.X.getId() == bVar.X.getId()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.Y.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        parcel.writeList(this.Y);
        parcel.writeInt(this.X.getId());
    }

    public b(@InterfaceC5670cr1 List<a.c> list, d dVar) {
        this.Y = list;
        this.X = dVar;
    }
}
