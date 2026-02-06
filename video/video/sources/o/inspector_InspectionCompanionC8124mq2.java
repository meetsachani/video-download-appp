package o;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.appcompat.widget.Toolbar;
import o.OL1;

/* renamed from: o.mq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class inspector.InspectionCompanionC8124mq2 implements InspectionCompanion {
    public boolean a = false;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f809o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    /* renamed from: a */
    public void readProperties(Toolbar toolbar, PropertyReader propertyReader) {
        if (this.a) {
            propertyReader.readObject(this.b, toolbar.getCollapseContentDescription());
            propertyReader.readObject(this.c, toolbar.getCollapseIcon());
            propertyReader.readInt(this.d, toolbar.getContentInsetEnd());
            propertyReader.readInt(this.e, toolbar.getContentInsetEndWithActions());
            propertyReader.readInt(this.f, toolbar.getContentInsetLeft());
            propertyReader.readInt(this.g, toolbar.getContentInsetRight());
            propertyReader.readInt(this.h, toolbar.getContentInsetStart());
            propertyReader.readInt(this.i, toolbar.getContentInsetStartWithNavigation());
            propertyReader.readObject(this.j, toolbar.getLogo());
            propertyReader.readObject(this.k, toolbar.getLogoDescription());
            propertyReader.readObject(this.l, toolbar.getMenu());
            propertyReader.readObject(this.m, toolbar.getNavigationContentDescription());
            propertyReader.readObject(this.n, toolbar.getNavigationIcon());
            propertyReader.readResourceId(this.f809o, toolbar.getPopupTheme());
            propertyReader.readObject(this.p, toolbar.getSubtitle());
            propertyReader.readObject(this.q, toolbar.getTitle());
            propertyReader.readInt(this.r, toolbar.getTitleMarginBottom());
            propertyReader.readInt(this.s, toolbar.getTitleMarginEnd());
            propertyReader.readInt(this.t, toolbar.getTitleMarginStart());
            propertyReader.readInt(this.u, toolbar.getTitleMarginTop());
            return;
        }
        throw C3412Kb.a();
    }

    public void mapProperties(PropertyMapper propertyMapper) {
        int mapObject;
        int mapObject2;
        int mapInt;
        int mapInt2;
        int mapInt3;
        int mapInt4;
        int mapInt5;
        int mapInt6;
        int mapObject3;
        int mapObject4;
        int mapObject5;
        int mapObject6;
        int mapObject7;
        int mapResourceId;
        int mapObject8;
        int mapObject9;
        int mapInt7;
        int mapInt8;
        int mapInt9;
        int mapInt10;
        mapObject = propertyMapper.mapObject("collapseContentDescription", OL1.b.z0);
        this.b = mapObject;
        mapObject2 = propertyMapper.mapObject("collapseIcon", OL1.b.A0);
        this.c = mapObject2;
        mapInt = propertyMapper.mapInt("contentInsetEnd", OL1.b.O0);
        this.d = mapInt;
        mapInt2 = propertyMapper.mapInt("contentInsetEndWithActions", OL1.b.P0);
        this.e = mapInt2;
        mapInt3 = propertyMapper.mapInt("contentInsetLeft", OL1.b.Q0);
        this.f = mapInt3;
        mapInt4 = propertyMapper.mapInt("contentInsetRight", OL1.b.R0);
        this.g = mapInt4;
        mapInt5 = propertyMapper.mapInt("contentInsetStart", OL1.b.S0);
        this.h = mapInt5;
        mapInt6 = propertyMapper.mapInt("contentInsetStartWithNavigation", OL1.b.T0);
        this.i = mapInt6;
        mapObject3 = propertyMapper.mapObject("logo", OL1.b.h2);
        this.j = mapObject3;
        mapObject4 = propertyMapper.mapObject("logoDescription", OL1.b.i2);
        this.k = mapObject4;
        mapObject5 = propertyMapper.mapObject(C9796th2.f, OL1.b.l2);
        this.l = mapObject5;
        mapObject6 = propertyMapper.mapObject("navigationContentDescription", OL1.b.n2);
        this.m = mapObject6;
        mapObject7 = propertyMapper.mapObject("navigationIcon", OL1.b.o2);
        this.n = mapObject7;
        mapResourceId = propertyMapper.mapResourceId("popupTheme", OL1.b.A2);
        this.f809o = mapResourceId;
        mapObject8 = propertyMapper.mapObject("subtitle", OL1.b.e3);
        this.p = mapObject8;
        mapObject9 = propertyMapper.mapObject("title", OL1.b.J3);
        this.q = mapObject9;
        mapInt7 = propertyMapper.mapInt("titleMarginBottom", OL1.b.L3);
        this.r = mapInt7;
        mapInt8 = propertyMapper.mapInt("titleMarginEnd", OL1.b.M3);
        this.s = mapInt8;
        mapInt9 = propertyMapper.mapInt("titleMarginStart", OL1.b.N3);
        this.t = mapInt9;
        mapInt10 = propertyMapper.mapInt("titleMarginTop", OL1.b.O3);
        this.u = mapInt10;
        this.a = true;
    }
}
