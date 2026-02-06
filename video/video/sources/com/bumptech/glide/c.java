package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.util.List;
import java.util.Map;
import o.AbstractC10819xt2;
import o.AbstractC7247jI2;
import o.C10938yN0;
import o.C4490Vc0;
import o.C8520oS1;
import o.InterfaceC2727De;
import o.InterfaceC7529kS1;
import o.JQ1;
import o.PC0;
import o.ZD0;

/* loaded from: classes.dex */
public class c extends ContextWrapper {
    public static final AbstractC10819xt2<?, ?> k = new PC0();
    public final InterfaceC2727De a;
    public final ZD0.b<JQ1> b;
    public final C10938yN0 c;
    public final a.InterfaceC0060a d;
    public final List<InterfaceC7529kS1<Object>> e;
    public final Map<Class<?>, AbstractC10819xt2<?, ?>> f;
    public final C4490Vc0 g;
    public final d h;
    public final int i;
    public C8520oS1 j;

    public c(Context context, InterfaceC2727De interfaceC2727De, ZD0.b<JQ1> bVar, C10938yN0 c10938yN0, a.InterfaceC0060a interfaceC0060a, Map<Class<?>, AbstractC10819xt2<?, ?>> map, List<InterfaceC7529kS1<Object>> list, C4490Vc0 c4490Vc0, d dVar, int i) {
        super(context.getApplicationContext());
        this.a = interfaceC2727De;
        this.c = c10938yN0;
        this.d = interfaceC0060a;
        this.e = list;
        this.f = map;
        this.g = c4490Vc0;
        this.h = dVar;
        this.i = i;
        this.b = ZD0.a(bVar);
    }

    public <X> AbstractC7247jI2<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.c.a(imageView, cls);
    }

    public InterfaceC2727De b() {
        return this.a;
    }

    public List<InterfaceC7529kS1<Object>> c() {
        return this.e;
    }

    public synchronized C8520oS1 d() {
        try {
            if (this.j == null) {
                this.j = this.d.build().o0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public <T> AbstractC10819xt2<?, T> e(Class<T> cls) {
        AbstractC10819xt2<?, T> abstractC10819xt2 = (AbstractC10819xt2<?, T>) this.f.get(cls);
        if (abstractC10819xt2 == null) {
            for (Map.Entry<Class<?>, AbstractC10819xt2<?, ?>> entry : this.f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC10819xt2 = (AbstractC10819xt2<?, T>) entry.getValue();
                }
            }
        }
        return abstractC10819xt2 == null ? (AbstractC10819xt2<?, T>) k : abstractC10819xt2;
    }

    public C4490Vc0 f() {
        return this.g;
    }

    public d g() {
        return this.h;
    }

    public int h() {
        return this.i;
    }

    public JQ1 i() {
        return this.b.get();
    }
}
