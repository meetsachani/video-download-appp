package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003a implements a {
        @Override // android.support.v4.media.session.a
        public void C6(CharSequence charSequence) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void I3(int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void O7(PlaybackStateCompat playbackStateCompat) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.a
        public void f1(int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void g2() throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void h6(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void i3() throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void l2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void l3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void onEvent(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void t5(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void z4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
        }

        @Override // android.support.v4.media.session.a
        public void z6(boolean z) throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements a {
        public static final String X = "android.support.v4.media.session.IMediaControllerCallback";
        public static final int Y = 1;
        public static final int Y0 = 3;
        public static final int Z = 2;
        public static final int Z0 = 4;
        public static final int a1 = 5;
        public static final int b1 = 6;
        public static final int c1 = 7;
        public static final int d1 = 8;
        public static final int e1 = 9;
        public static final int f1 = 10;
        public static final int g1 = 11;
        public static final int h1 = 12;
        public static final int i1 = 13;

        /* renamed from: android.support.v4.media.session.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0004a implements a {
            public static a Y;
            public IBinder X;

            public C0004a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void C6(CharSequence charSequence) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(6, obtain, null, 1) && b.g1() != null) {
                        b.g1().C6(charSequence);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void I3(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeInt(i);
                    if (!this.X.transact(12, obtain, null, 1) && b.g1() != null) {
                        b.g1().I3(i);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public String O0() {
                return b.X;
            }

            @Override // android.support.v4.media.session.a
            public void O7(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(3, obtain, null, 1) && b.g1() != null) {
                        b.g1().O7(playbackStateCompat);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.v4.media.session.a
            public void f1(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeInt(i);
                    if (!this.X.transact(9, obtain, null, 1) && b.g1() != null) {
                        b.g1().f1(i);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void g2() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (!this.X.transact(13, obtain, null, 1) && b.g1() != null) {
                        b.g1().g2();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void h6(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.X.transact(11, obtain, null, 1) && b.g1() != null) {
                        b.g1().h6(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void i3() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (!this.X.transact(2, obtain, null, 1) && b.g1() != null) {
                        b.g1().i3();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void l2(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeTypedList(list);
                    if (!this.X.transact(5, obtain, null, 1) && b.g1() != null) {
                        b.g1().l2(list);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.a
            public void l3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(4, obtain, null, 1) && b.g1() != null) {
                        b.g1().l3(mediaMetadataCompat);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(1, obtain, null, 1) && b.g1() != null) {
                        b.g1().onEvent(str, bundle);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void t5(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(7, obtain, null, 1) && b.g1() != null) {
                        b.g1().t5(bundle);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void z4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(8, obtain, null, 1) && b.g1() != null) {
                        b.g1().z4(parcelableVolumeInfo);
                        obtain.recycle();
                        return;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.a
            public void z6(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.X);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.X.transact(10, obtain, null, 1) && b.g1() != null) {
                        b.g1().z6(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, X);
        }

        public static a O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0004a(iBinder);
        }

        public static a g1() {
            return C0004a.Y;
        }

        public static boolean o1(a aVar) {
            if (C0004a.Y == null) {
                if (aVar != null) {
                    C0004a.Y = aVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(X);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        onEvent(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface(X);
                        i3();
                        return true;
                    case 3:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        O7(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        l3(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface(X);
                        l2(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        C6(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        t5(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        z4(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface(X);
                        f1(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        z6(z);
                        return true;
                    case 11:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        h6(z);
                        return true;
                    case 12:
                        parcel.enforceInterface(X);
                        I3(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface(X);
                        g2();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(X);
            return true;
        }
    }

    void C6(CharSequence charSequence) throws RemoteException;

    void I3(int i) throws RemoteException;

    void O7(PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void f1(int i) throws RemoteException;

    void g2() throws RemoteException;

    void h6(boolean z) throws RemoteException;

    void i3() throws RemoteException;

    void l2(List<MediaSessionCompat.QueueItem> list) throws RemoteException;

    void l3(MediaMetadataCompat mediaMetadataCompat) throws RemoteException;

    void onEvent(String str, Bundle bundle) throws RemoteException;

    void t5(Bundle bundle) throws RemoteException;

    void z4(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException;

    void z6(boolean z) throws RemoteException;
}
