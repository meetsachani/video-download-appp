package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @InterfaceC5670cr1
        public static IFragmentWrapper g1(@InterfaceC5670cr1 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean O0(int i, @InterfaceC5670cr1 Parcel parcel, @InterfaceC5670cr1 Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper g = g();
                    parcel2.writeNoException();
                    zzc.e(parcel2, g);
                    return true;
                case 3:
                    Bundle f = f();
                    parcel2.writeNoException();
                    zzc.d(parcel2, f);
                    return true;
                case 4:
                    int b = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    return true;
                case 5:
                    IFragmentWrapper d = d();
                    parcel2.writeNoException();
                    zzc.e(parcel2, d);
                    return true;
                case 6:
                    IObjectWrapper h = h();
                    parcel2.writeNoException();
                    zzc.e(parcel2, h);
                    return true;
                case 7:
                    boolean s = s();
                    parcel2.writeNoException();
                    int i3 = zzc.b;
                    parcel2.writeInt(s ? 1 : 0);
                    return true;
                case 8:
                    String j = j();
                    parcel2.writeNoException();
                    parcel2.writeString(j);
                    return true;
                case 9:
                    IFragmentWrapper e = e();
                    parcel2.writeNoException();
                    zzc.e(parcel2, e);
                    return true;
                case 10:
                    int c = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c);
                    return true;
                case 11:
                    boolean v = v();
                    parcel2.writeNoException();
                    int i4 = zzc.b;
                    parcel2.writeInt(v ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper i5 = i();
                    parcel2.writeNoException();
                    zzc.e(parcel2, i5);
                    return true;
                case 13:
                    boolean t = t();
                    parcel2.writeNoException();
                    int i6 = zzc.b;
                    parcel2.writeInt(t ? 1 : 0);
                    return true;
                case 14:
                    boolean q = q();
                    parcel2.writeNoException();
                    int i7 = zzc.b;
                    parcel2.writeInt(q ? 1 : 0);
                    return true;
                case 15:
                    boolean B = B();
                    parcel2.writeNoException();
                    int i8 = zzc.b;
                    parcel2.writeInt(B ? 1 : 0);
                    return true;
                case 16:
                    boolean y = y();
                    parcel2.writeNoException();
                    int i9 = zzc.b;
                    parcel2.writeInt(y ? 1 : 0);
                    return true;
                case 17:
                    boolean w = w();
                    parcel2.writeNoException();
                    int i10 = zzc.b;
                    parcel2.writeInt(w ? 1 : 0);
                    return true;
                case 18:
                    boolean C = C();
                    parcel2.writeNoException();
                    int i11 = zzc.b;
                    parcel2.writeInt(C ? 1 : 0);
                    return true;
                case 19:
                    boolean L = L();
                    parcel2.writeNoException();
                    int i12 = zzc.b;
                    parcel2.writeInt(L ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                    zzc.b(parcel);
                    b0(g1);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean f2 = zzc.f(parcel);
                    zzc.b(parcel);
                    Q0(f2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean f3 = zzc.f(parcel);
                    zzc.b(parcel);
                    R4(f3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean f4 = zzc.f(parcel);
                    zzc.b(parcel);
                    a0(f4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean f5 = zzc.f(parcel);
                    zzc.b(parcel);
                    q1(f5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    zzc.b(parcel);
                    M5((Intent) zzc.a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    int readInt = parcel.readInt();
                    zzc.b(parcel);
                    U5((Intent) zzc.a(parcel, Intent.CREATOR), readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                    zzc.b(parcel);
                    O(g12);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean B() throws RemoteException;

    boolean C() throws RemoteException;

    boolean L() throws RemoteException;

    void M5(@InterfaceC5670cr1 Intent intent) throws RemoteException;

    void O(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) throws RemoteException;

    void Q0(boolean z) throws RemoteException;

    void R4(boolean z) throws RemoteException;

    void U5(@InterfaceC5670cr1 Intent intent, int i) throws RemoteException;

    void a0(boolean z) throws RemoteException;

    int b() throws RemoteException;

    void b0(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) throws RemoteException;

    int c() throws RemoteException;

    @InterfaceC11300zs1
    IFragmentWrapper d() throws RemoteException;

    @InterfaceC11300zs1
    IFragmentWrapper e() throws RemoteException;

    @InterfaceC11300zs1
    Bundle f() throws RemoteException;

    @InterfaceC5670cr1
    IObjectWrapper g() throws RemoteException;

    @InterfaceC5670cr1
    IObjectWrapper h() throws RemoteException;

    @InterfaceC5670cr1
    IObjectWrapper i() throws RemoteException;

    @InterfaceC11300zs1
    String j() throws RemoteException;

    boolean q() throws RemoteException;

    void q1(boolean z) throws RemoteException;

    boolean s() throws RemoteException;

    boolean t() throws RemoteException;

    boolean v() throws RemoteException;

    boolean w() throws RemoteException;

    boolean y() throws RemoteException;
}
