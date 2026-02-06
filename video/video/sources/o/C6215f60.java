package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.f60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6215f60 implements InterfaceC5819dS1 {
    public String a;
    public String b;
    public String c;
    public EnumC10183vH1 d = EnumC10183vH1.MEDIUM;
    public Object e;
    public int f;
    public int g;
    public String h;
    public HashMap<String, List<String>> i;

    public C6215f60(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public C5730d60 f() {
        return new C5730d60(this);
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: g */
    public C6215f60 a(int i) {
        this.g = i;
        return this;
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: h */
    public C6215f60 setHeader(String str, String str2) {
        if (this.i == null) {
            this.i = new HashMap<>();
        }
        List<String> list = this.i.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.i.put(str, list);
        }
        if (!list.contains(str2)) {
            list.add(str2);
        }
        return this;
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: i */
    public C6215f60 d(EnumC10183vH1 enumC10183vH1) {
        this.d = enumC10183vH1;
        return this;
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: j */
    public C6215f60 e(int i) {
        this.f = i;
        return this;
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: k */
    public C6215f60 c(Object obj) {
        this.e = obj;
        return this;
    }

    @Override // o.InterfaceC5819dS1
    /* renamed from: l */
    public C6215f60 b(String str) {
        this.h = str;
        return this;
    }
}
