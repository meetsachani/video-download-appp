package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.io.InputStream;
import o.GP1;
import o.InterfaceC2727De;

/* loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public static final int b = 5242880;
    public final GP1 a;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0063a<InputStream> {
        public final InterfaceC2727De a;

        public a(InterfaceC2727De interfaceC2727De) {
            this.a = interfaceC2727De;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0063a
        /* renamed from: c */
        public com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, InterfaceC2727De interfaceC2727De) {
        GP1 gp1 = new GP1(inputStream, interfaceC2727De);
        this.a = gp1;
        gp1.mark(5242880);
    }

    public void a() {
        this.a.d();
    }

    @Override // com.bumptech.glide.load.data.a
    public void b() {
        this.a.g();
    }

    @Override // com.bumptech.glide.load.data.a
    /* renamed from: d */
    public InputStream c() throws IOException {
        this.a.reset();
        return this.a;
    }
}
