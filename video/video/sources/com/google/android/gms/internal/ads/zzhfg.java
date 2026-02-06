package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import o.C6566gU0;

/* loaded from: classes2.dex */
public class zzhfg implements Iterator, Closeable, zzari {
    public static final zzarh b1 = new zzhff("eof ");
    public zzare X;
    public zzhfh Y;
    public zzarh Z = null;
    public long Y0 = 0;
    public long Z0 = 0;
    public final List a1 = new ArrayList();

    static {
        zzhfn.b(zzhfg.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    /* renamed from: f */
    public final zzarh next() {
        zzarh a;
        zzarh zzarhVar = this.Z;
        if (zzarhVar != null && zzarhVar != b1) {
            this.Z = null;
            return zzarhVar;
        }
        zzhfh zzhfhVar = this.Y;
        if (zzhfhVar != null && this.Y0 < this.Z0) {
            try {
                synchronized (zzhfhVar) {
                    this.Y.w(this.Y0);
                    a = this.X.a(this.Y, this);
                    this.Y0 = this.Y.b();
                }
                return a;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.Z = b1;
        throw new NoSuchElementException();
    }

    public final List h() {
        if (this.Y != null && this.Z != b1) {
            return new zzhfm(this.a1, this);
        }
        return this.a1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzarh zzarhVar = this.Z;
        if (zzarhVar == b1) {
            return false;
        }
        if (zzarhVar != null) {
            return true;
        }
        try {
            this.Z = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.Z = b1;
            return false;
        }
    }

    public final void i(zzhfh zzhfhVar, long j, zzare zzareVar) throws IOException {
        this.Y = zzhfhVar;
        this.Y0 = zzhfhVar.b();
        zzhfhVar.w(zzhfhVar.b() + j);
        this.Z0 = zzhfhVar.b();
        this.X = zzareVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(C6566gU0.f);
        int i = 0;
        while (true) {
            List list = this.a1;
            if (i < list.size()) {
                if (i > 0) {
                    sb.append(";");
                }
                sb.append(((zzarh) list.get(i)).toString());
                i++;
            } else {
                sb.append(C6566gU0.g);
                return sb.toString();
            }
        }
    }
}
