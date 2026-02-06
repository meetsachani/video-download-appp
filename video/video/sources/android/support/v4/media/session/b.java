package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static class a implements b {
        @Override // android.support.v4.media.session.b
        public void A2(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void B3(int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public Bundle C0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public boolean E1() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public void E4(android.support.v4.media.session.a aVar) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void E6(int i, int i2, String str) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public int G0() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public boolean H0() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public void H1(Uri uri, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void I2(Uri uri, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void J3(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void J4(RatingCompat ratingCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void N0(int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void O4(int i, int i2, String str) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void O5(android.support.v4.media.session.a aVar) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void P3() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void S0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void T0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public PendingIntent U1() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public CharSequence V0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public PlaybackStateCompat X() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public long Y() throws RemoteException {
            return 0L;
        }

        @Override // android.support.v4.media.session.b
        public void Y0(long j) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public boolean Z2(KeyEvent keyEvent) throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public boolean Z4() throws RemoteException {
            return false;
        }

        @Override // android.support.v4.media.session.b
        public void Z5() throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void b1(float f) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void c1(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void f3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void f5(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public Bundle getExtras() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void h4(long j) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public String i0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void i4(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public String k0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void k3(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public List<MediaSessionCompat.QueueItem> l1() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void m0() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void next() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public MediaMetadataCompat o0() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public void pause() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void previous() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void s2(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void stop() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void t0() throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public void u0(int i) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public ParcelableVolumeInfo v7() throws RemoteException {
            return null;
        }

        @Override // android.support.v4.media.session.b
        public int w0() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public void w1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.v4.media.session.b
        public int y0() throws RemoteException {
            return 0;
        }

        @Override // android.support.v4.media.session.b
        public void y2(String str, Bundle bundle) throws RemoteException {
        }
    }

    /* renamed from: android.support.v4.media.session.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0005b extends Binder implements b {
        public static final int A1 = 36;
        public static final int B1 = 13;
        public static final int C1 = 14;
        public static final int D1 = 15;
        public static final int E1 = 16;
        public static final int F1 = 17;
        public static final int G1 = 18;
        public static final int H1 = 19;
        public static final int I1 = 20;
        public static final int J1 = 21;
        public static final int K1 = 22;
        public static final int L1 = 23;
        public static final int M1 = 24;
        public static final int N1 = 25;
        public static final int O1 = 51;
        public static final int P1 = 49;
        public static final int Q1 = 46;
        public static final int R1 = 39;
        public static final int S1 = 40;
        public static final int T1 = 48;
        public static final int U1 = 26;
        public static final String X = "android.support.v4.media.session.IMediaSession";
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
        public static final int i1 = 27;
        public static final int j1 = 28;
        public static final int k1 = 29;
        public static final int l1 = 30;
        public static final int m1 = 31;
        public static final int n1 = 32;
        public static final int o1 = 45;
        public static final int p1 = 37;
        public static final int q1 = 38;
        public static final int r1 = 47;
        public static final int s1 = 41;
        public static final int t1 = 42;
        public static final int u1 = 43;
        public static final int v1 = 44;
        public static final int w1 = 50;
        public static final int x1 = 33;
        public static final int y1 = 34;
        public static final int z1 = 35;

        /* renamed from: android.support.v4.media.session.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements b {
            public static b Y;
            public IBinder X;

            public a(IBinder iBinder) {
                this.X = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public void A2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(15, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().A2(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void B3(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(i);
                    if (!this.X.transact(44, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().B3(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle C0() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(50, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        bundle = AbstractBinderC0005b.g1().C0();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                        } else {
                            bundle = null;
                        }
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean E1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    boolean z = false;
                    if (!this.X.transact(38, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        return AbstractBinderC0005b.g1().E1();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void E4(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(3, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().E4(aVar);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void E6(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.X.transact(11, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().E6(i, i2, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int G0() throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(47, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readInt = AbstractBinderC0005b.g1().G0();
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean H0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    boolean z = false;
                    if (!this.X.transact(45, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        return AbstractBinderC0005b.g1().H0();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void H1(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(36, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().H1(uri, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void I2(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(16, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().I2(uri, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void J3(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(1, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().J3(str, bundle, resultReceiverWrapper);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void J4(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(25, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().J4(ratingCompat);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void N0(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(i);
                    if (!this.X.transact(48, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().N0(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String O0() {
                return AbstractBinderC0005b.X;
            }

            @Override // android.support.v4.media.session.b
            public void O4(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    if (!this.X.transact(12, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().O4(i, i2, str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void O5(android.support.v4.media.session.a aVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (!this.X.transact(4, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().O5(aVar);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void P3() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(23, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().P3();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void S0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(43, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().S0(mediaDescriptionCompat);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void T0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(41, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().T0(mediaDescriptionCompat);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent U1() throws RemoteException {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(8, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        pendingIntent = AbstractBinderC0005b.g1().U1();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                        } else {
                            pendingIntent = null;
                        }
                    }
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public CharSequence V0() throws RemoteException {
                CharSequence charSequence;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(30, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        charSequence = AbstractBinderC0005b.g1().V0();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                        } else {
                            charSequence = null;
                        }
                    }
                    return charSequence;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat X() throws RemoteException {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(28, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        playbackStateCompat = AbstractBinderC0005b.g1().X();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                        } else {
                            playbackStateCompat = null;
                        }
                    }
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public long Y() throws RemoteException {
                long readLong;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(9, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readLong = AbstractBinderC0005b.g1().Y();
                    } else {
                        obtain2.readException();
                        readLong = obtain2.readLong();
                    }
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Y0(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeLong(j);
                    if (!this.X.transact(24, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().Y0(j);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean Z2(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(2, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        boolean Z2 = AbstractBinderC0005b.g1().Z2(keyEvent);
                        obtain2.recycle();
                        obtain.recycle();
                        return Z2;
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean Z4() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    boolean z = false;
                    if (!this.X.transact(5, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        return AbstractBinderC0005b.g1().Z4();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void Z5() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(22, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().Z5();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.v4.media.session.b
            public void b1(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeFloat(f);
                    if (!this.X.transact(49, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().b1(f);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void c1(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.X.transact(46, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().c1(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void f3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(51, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().f3(ratingCompat, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void f5(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(35, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().f5(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(31, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        bundle = AbstractBinderC0005b.g1().getExtras();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                        } else {
                            bundle = null;
                        }
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void h4(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeLong(j);
                    if (!this.X.transact(17, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().h4(j);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String i0() throws RemoteException {
                String readString;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(7, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readString = AbstractBinderC0005b.g1().i0();
                    } else {
                        obtain2.readException();
                        readString = obtain2.readString();
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void i4(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(z ? 1 : 0);
                    if (!this.X.transact(40, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().i4(z);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public String k0() throws RemoteException {
                String readString;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(6, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readString = AbstractBinderC0005b.g1().k0();
                    } else {
                        obtain2.readException();
                        readString = obtain2.readString();
                    }
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void k3(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    if (!this.X.transact(42, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().k3(mediaDescriptionCompat, i);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public List<MediaSessionCompat.QueueItem> l1() throws RemoteException {
                List<MediaSessionCompat.QueueItem> createTypedArrayList;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(29, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        createTypedArrayList = AbstractBinderC0005b.g1().l1();
                    } else {
                        obtain2.readException();
                        createTypedArrayList = obtain2.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                    }
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void m0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(33, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().m0();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(20, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().next();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat o0() throws RemoteException {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(27, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        mediaMetadataCompat = AbstractBinderC0005b.g1().o0();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                        } else {
                            mediaMetadataCompat = null;
                        }
                    }
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(18, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().pause();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(21, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().previous();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void s2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(34, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().s2(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(19, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().stop();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void t0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(13, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().t0();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void u0(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeInt(i);
                    if (!this.X.transact(39, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().u0(i);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo v7() throws RemoteException {
                ParcelableVolumeInfo parcelableVolumeInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(10, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        parcelableVolumeInfo = AbstractBinderC0005b.g1().v7();
                    } else {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2);
                        } else {
                            parcelableVolumeInfo = null;
                        }
                    }
                    return parcelableVolumeInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public int w0() throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(37, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readInt = AbstractBinderC0005b.g1().w0();
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void w1(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(26, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().w1(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public int y0() throws RemoteException {
                int readInt;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    if (!this.X.transact(32, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        readInt = AbstractBinderC0005b.g1().y0();
                    } else {
                        obtain2.readException();
                        readInt = obtain2.readInt();
                    }
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void y2(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(AbstractBinderC0005b.X);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.X.transact(14, obtain, obtain2, 0) && AbstractBinderC0005b.g1() != null) {
                        AbstractBinderC0005b.g1().y2(str, bundle);
                    } else {
                        obtain2.readException();
                    }
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC0005b() {
            attachInterface(this, X);
        }

        public static b O0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(X);
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static b g1() {
            return a.Y;
        }

        public static boolean o1(b bVar) {
            if (a.Y == null) {
                if (bVar != null) {
                    a.Y = bVar;
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
            Bundle bundle;
            Uri uri;
            Uri uri2;
            RatingCompat ratingCompat;
            if (i != 1598968902) {
                boolean z = false;
                MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
                Bundle bundle2 = null;
                MediaDescriptionCompat mediaDescriptionCompat = null;
                MediaDescriptionCompat mediaDescriptionCompat2 = null;
                MediaDescriptionCompat mediaDescriptionCompat3 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                Bundle bundle5 = null;
                Bundle bundle6 = null;
                RatingCompat ratingCompat2 = null;
                Bundle bundle7 = null;
                Bundle bundle8 = null;
                Bundle bundle9 = null;
                KeyEvent keyEvent = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface(X);
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        } else {
                            bundle = null;
                        }
                        if (parcel.readInt() != 0) {
                            resultReceiverWrapper = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                        }
                        J3(readString, bundle, resultReceiverWrapper);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        boolean Z2 = Z2(keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(Z2 ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface(X);
                        E4(a.b.O0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(X);
                        O5(a.b.O0(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(X);
                        boolean Z4 = Z4();
                        parcel2.writeNoException();
                        parcel2.writeInt(Z4 ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(X);
                        String k0 = k0();
                        parcel2.writeNoException();
                        parcel2.writeString(k0);
                        return true;
                    case 7:
                        parcel.enforceInterface(X);
                        String i0 = i0();
                        parcel2.writeNoException();
                        parcel2.writeString(i0);
                        return true;
                    case 8:
                        parcel.enforceInterface(X);
                        PendingIntent U12 = U1();
                        parcel2.writeNoException();
                        if (U12 != null) {
                            parcel2.writeInt(1);
                            U12.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 9:
                        parcel.enforceInterface(X);
                        long Y2 = Y();
                        parcel2.writeNoException();
                        parcel2.writeLong(Y2);
                        return true;
                    case 10:
                        parcel.enforceInterface(X);
                        ParcelableVolumeInfo v7 = v7();
                        parcel2.writeNoException();
                        if (v7 != null) {
                            parcel2.writeInt(1);
                            v7.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 11:
                        parcel.enforceInterface(X);
                        E6(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(X);
                        O4(parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(X);
                        t0();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(X);
                        String readString2 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        y2(readString2, bundle9);
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface(X);
                        String readString3 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        A2(readString3, bundle8);
                        parcel2.writeNoException();
                        return true;
                    case 16:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            uri = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        I2(uri, bundle7);
                        parcel2.writeNoException();
                        return true;
                    case 17:
                        parcel.enforceInterface(X);
                        h4(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface(X);
                        pause();
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface(X);
                        stop();
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface(X);
                        next();
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface(X);
                        previous();
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(X);
                        Z5();
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(X);
                        P3();
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface(X);
                        Y0(parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            ratingCompat2 = RatingCompat.CREATOR.createFromParcel(parcel);
                        }
                        J4(ratingCompat2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface(X);
                        String readString4 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        w1(readString4, bundle6);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface(X);
                        MediaMetadataCompat o0 = o0();
                        parcel2.writeNoException();
                        if (o0 != null) {
                            parcel2.writeInt(1);
                            o0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 28:
                        parcel.enforceInterface(X);
                        PlaybackStateCompat X2 = X();
                        parcel2.writeNoException();
                        if (X2 != null) {
                            parcel2.writeInt(1);
                            X2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface(X);
                        List<MediaSessionCompat.QueueItem> l12 = l1();
                        parcel2.writeNoException();
                        parcel2.writeTypedList(l12);
                        return true;
                    case 30:
                        parcel.enforceInterface(X);
                        CharSequence V0 = V0();
                        parcel2.writeNoException();
                        if (V0 != null) {
                            parcel2.writeInt(1);
                            TextUtils.writeToParcel(V0, parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 31:
                        parcel.enforceInterface(X);
                        Bundle extras = getExtras();
                        parcel2.writeNoException();
                        if (extras != null) {
                            parcel2.writeInt(1);
                            extras.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 32:
                        parcel.enforceInterface(X);
                        int y0 = y0();
                        parcel2.writeNoException();
                        parcel2.writeInt(y0);
                        return true;
                    case 33:
                        parcel.enforceInterface(X);
                        m0();
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface(X);
                        String readString5 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        s2(readString5, bundle5);
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface(X);
                        String readString6 = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        f5(readString6, bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            uri2 = (Uri) Uri.CREATOR.createFromParcel(parcel);
                        } else {
                            uri2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        H1(uri2, bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface(X);
                        int w0 = w0();
                        parcel2.writeNoException();
                        parcel2.writeInt(w0);
                        return true;
                    case 38:
                        parcel.enforceInterface(X);
                        boolean E12 = E1();
                        parcel2.writeNoException();
                        parcel2.writeInt(E12 ? 1 : 0);
                        return true;
                    case 39:
                        parcel.enforceInterface(X);
                        u0(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 40:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        i4(z);
                        parcel2.writeNoException();
                        return true;
                    case 41:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        T0(mediaDescriptionCompat3);
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        k3(mediaDescriptionCompat2, parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        }
                        S0(mediaDescriptionCompat);
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface(X);
                        B3(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 45:
                        parcel.enforceInterface(X);
                        boolean H0 = H0();
                        parcel2.writeNoException();
                        parcel2.writeInt(H0 ? 1 : 0);
                        return true;
                    case 46:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        c1(z);
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface(X);
                        int G0 = G0();
                        parcel2.writeNoException();
                        parcel2.writeInt(G0);
                        return true;
                    case 48:
                        parcel.enforceInterface(X);
                        N0(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface(X);
                        b1(parcel.readFloat());
                        parcel2.writeNoException();
                        return true;
                    case 50:
                        parcel.enforceInterface(X);
                        Bundle C0 = C0();
                        parcel2.writeNoException();
                        if (C0 != null) {
                            parcel2.writeInt(1);
                            C0.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 51:
                        parcel.enforceInterface(X);
                        if (parcel.readInt() != 0) {
                            ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                        } else {
                            ratingCompat = null;
                        }
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        f3(ratingCompat, bundle2);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(X);
            return true;
        }
    }

    void A2(String str, Bundle bundle) throws RemoteException;

    void B3(int i) throws RemoteException;

    Bundle C0() throws RemoteException;

    boolean E1() throws RemoteException;

    void E4(android.support.v4.media.session.a aVar) throws RemoteException;

    void E6(int i, int i2, String str) throws RemoteException;

    int G0() throws RemoteException;

    boolean H0() throws RemoteException;

    void H1(Uri uri, Bundle bundle) throws RemoteException;

    void I2(Uri uri, Bundle bundle) throws RemoteException;

    void J3(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    void J4(RatingCompat ratingCompat) throws RemoteException;

    void N0(int i) throws RemoteException;

    void O4(int i, int i2, String str) throws RemoteException;

    void O5(android.support.v4.media.session.a aVar) throws RemoteException;

    void P3() throws RemoteException;

    void S0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    void T0(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    PendingIntent U1() throws RemoteException;

    CharSequence V0() throws RemoteException;

    PlaybackStateCompat X() throws RemoteException;

    long Y() throws RemoteException;

    void Y0(long j) throws RemoteException;

    boolean Z2(KeyEvent keyEvent) throws RemoteException;

    boolean Z4() throws RemoteException;

    void Z5() throws RemoteException;

    void b1(float f) throws RemoteException;

    void c1(boolean z) throws RemoteException;

    void f3(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    void f5(String str, Bundle bundle) throws RemoteException;

    Bundle getExtras() throws RemoteException;

    void h4(long j) throws RemoteException;

    String i0() throws RemoteException;

    void i4(boolean z) throws RemoteException;

    String k0() throws RemoteException;

    void k3(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    List<MediaSessionCompat.QueueItem> l1() throws RemoteException;

    void m0() throws RemoteException;

    void next() throws RemoteException;

    MediaMetadataCompat o0() throws RemoteException;

    void pause() throws RemoteException;

    void previous() throws RemoteException;

    void s2(String str, Bundle bundle) throws RemoteException;

    void stop() throws RemoteException;

    void t0() throws RemoteException;

    void u0(int i) throws RemoteException;

    ParcelableVolumeInfo v7() throws RemoteException;

    int w0() throws RemoteException;

    void w1(String str, Bundle bundle) throws RemoteException;

    int y0() throws RemoteException;

    void y2(String str, Bundle bundle) throws RemoteException;
}
