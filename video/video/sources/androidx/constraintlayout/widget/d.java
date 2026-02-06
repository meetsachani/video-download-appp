package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.C5445bv2;
import o.C9698tH2;

/* loaded from: classes.dex */
public class d {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 0;
    public static final int m = -2;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f19o = 0;
    public ConstraintLayout.b a;
    public View b;

    public d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.a = (ConstraintLayout.b) layoutParams;
            this.b = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    public d A(float f2) {
        this.a.L = f2;
        return this;
    }

    public d B(int i2, int i3) {
        switch (i2) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.a).leftMargin = i3;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.a).rightMargin = i3;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.a).topMargin = i3;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.a).bottomMargin = i3;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.a.setMarginStart(i3);
                return this;
            case 7:
                this.a.setMarginEnd(i3);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public d C(int i2) {
        switch (i2) {
            case 1:
                ConstraintLayout.b bVar = this.a;
                bVar.f = -1;
                bVar.e = -1;
                ((ViewGroup.MarginLayoutParams) bVar).leftMargin = -1;
                bVar.w = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.b bVar2 = this.a;
                bVar2.h = -1;
                bVar2.g = -1;
                ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = -1;
                bVar2.y = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.b bVar3 = this.a;
                bVar3.j = -1;
                bVar3.i = -1;
                ((ViewGroup.MarginLayoutParams) bVar3).topMargin = -1;
                bVar3.x = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.b bVar4 = this.a;
                bVar4.k = -1;
                bVar4.l = -1;
                ((ViewGroup.MarginLayoutParams) bVar4).bottomMargin = -1;
                bVar4.z = Integer.MIN_VALUE;
                return this;
            case 5:
                this.a.m = -1;
                return this;
            case 6:
                ConstraintLayout.b bVar5 = this.a;
                bVar5.s = -1;
                bVar5.t = -1;
                bVar5.setMarginStart(-1);
                this.a.A = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.b bVar6 = this.a;
                bVar6.u = -1;
                bVar6.v = -1;
                bVar6.setMarginEnd(-1);
                this.a.B = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public d D() {
        ConstraintLayout.b bVar = this.a;
        int i2 = bVar.f;
        int i3 = bVar.g;
        if (i2 == -1 && i3 == -1) {
            int i4 = bVar.s;
            int i5 = bVar.u;
            if (i4 != -1 || i5 != -1) {
                d dVar = new d(((ViewGroup) this.b.getParent()).findViewById(i4));
                d dVar2 = new d(((ViewGroup) this.b.getParent()).findViewById(i5));
                ConstraintLayout.b bVar2 = this.a;
                if (i4 != -1 && i5 != -1) {
                    dVar.m(7, i5, 6, 0);
                    dVar2.m(6, i2, 7, 0);
                } else if (i2 != -1 || i5 != -1) {
                    int i6 = bVar2.h;
                    if (i6 != -1) {
                        dVar.m(7, i6, 7, 0);
                    } else {
                        int i7 = bVar2.e;
                        if (i7 != -1) {
                            dVar2.m(6, i7, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
            return this;
        }
        d dVar3 = new d(((ViewGroup) this.b.getParent()).findViewById(i2));
        d dVar4 = new d(((ViewGroup) this.b.getParent()).findViewById(i3));
        ConstraintLayout.b bVar3 = this.a;
        if (i2 != -1 && i3 != -1) {
            dVar3.m(2, i3, 1, 0);
            dVar4.m(1, i2, 2, 0);
        } else if (i2 != -1 || i3 != -1) {
            int i8 = bVar3.h;
            if (i8 != -1) {
                dVar3.m(2, i8, 2, 0);
            } else {
                int i9 = bVar3.e;
                if (i9 != -1) {
                    dVar4.m(1, i9, 1, 0);
                }
            }
        }
        C(1);
        C(2);
        return this;
    }

    public d E() {
        ConstraintLayout.b bVar = this.a;
        int i2 = bVar.j;
        int i3 = bVar.k;
        if (i2 != -1 || i3 != -1) {
            d dVar = new d(((ViewGroup) this.b.getParent()).findViewById(i2));
            d dVar2 = new d(((ViewGroup) this.b.getParent()).findViewById(i3));
            ConstraintLayout.b bVar2 = this.a;
            if (i2 != -1 && i3 != -1) {
                dVar.m(4, i3, 3, 0);
                dVar2.m(3, i2, 4, 0);
            } else if (i2 != -1 || i3 != -1) {
                int i4 = bVar2.l;
                if (i4 != -1) {
                    dVar.m(4, i4, 4, 0);
                } else {
                    int i5 = bVar2.i;
                    if (i5 != -1) {
                        dVar2.m(3, i5, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public d F(float f2) {
        this.b.setRotation(f2);
        return this;
    }

    public d G(float f2) {
        this.b.setRotationX(f2);
        return this;
    }

    public d H(float f2) {
        this.b.setRotationY(f2);
        return this;
    }

    public d I(float f2) {
        this.b.setScaleY(f2);
        return this;
    }

    public d J(float f2) {
        return this;
    }

    public final String K(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return C5445bv2.n0;
            case 3:
                return C9698tH2.l;
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public d L(float f2, float f3) {
        this.b.setPivotX(f2);
        this.b.setPivotY(f3);
        return this;
    }

    public d M(float f2) {
        this.b.setPivotX(f2);
        return this;
    }

    public d N(float f2) {
        this.b.setPivotY(f2);
        return this;
    }

    public d O(float f2, float f3) {
        this.b.setTranslationX(f2);
        this.b.setTranslationY(f3);
        return this;
    }

    public d P(float f2) {
        this.b.setTranslationX(f2);
        return this;
    }

    public d Q(float f2) {
        this.b.setTranslationY(f2);
        return this;
    }

    public d R(float f2) {
        this.b.setTranslationZ(f2);
        return this;
    }

    public d S(float f2) {
        this.a.H = f2;
        return this;
    }

    public d T(int i2) {
        this.a.O = i2;
        return this;
    }

    public d U(float f2) {
        this.a.M = f2;
        return this;
    }

    public d V(int i2) {
        this.b.setVisibility(i2);
        return this;
    }

    public d a(int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        m(1, i2, i4, 0);
        if (i3 == 0) {
            i5 = 2;
        } else {
            i5 = 1;
        }
        m(2, i3, i5, 0);
        if (i2 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i2)).m(2, this.b.getId(), 1, 0);
        }
        if (i3 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i3)).m(1, this.b.getId(), 2, 0);
        }
        return this;
    }

    public d b(int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 6;
        } else {
            i4 = 7;
        }
        m(6, i2, i4, 0);
        if (i3 == 0) {
            i5 = 7;
        } else {
            i5 = 6;
        }
        m(7, i3, i5, 0);
        if (i2 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i2)).m(7, this.b.getId(), 6, 0);
        }
        if (i3 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i3)).m(6, this.b.getId(), 7, 0);
        }
        return this;
    }

    public d c(int i2, int i3) {
        int i4;
        int i5;
        if (i2 == 0) {
            i4 = 3;
        } else {
            i4 = 4;
        }
        m(3, i2, i4, 0);
        if (i3 == 0) {
            i5 = 4;
        } else {
            i5 = 3;
        }
        m(4, i3, i5, 0);
        if (i2 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i2)).m(4, this.b.getId(), 3, 0);
        }
        if (i3 != 0) {
            new d(((ViewGroup) this.b.getParent()).findViewById(i3)).m(3, this.b.getId(), 4, 0);
        }
        return this;
    }

    public d d(float f2) {
        this.b.setAlpha(f2);
        return this;
    }

    public void e() {
    }

    public d f(int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        if (i4 >= 0) {
            if (i7 >= 0) {
                if (f2 > 0.0f && f2 <= 1.0f) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 6 && i3 != 7) {
                            m(3, i2, i3, i4);
                            m(4, i5, i6, i7);
                            this.a.H = f2;
                            return this;
                        }
                        m(6, i2, i3, i4);
                        m(7, i5, i6, i7);
                        this.a.G = f2;
                        return this;
                    }
                    m(1, i2, i3, i4);
                    m(2, i5, i6, i7);
                    this.a.G = f2;
                    return this;
                }
                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }
            throw new IllegalArgumentException("margin must be > 0");
        }
        throw new IllegalArgumentException("margin must be > 0");
    }

    public d g(int i2) {
        if (i2 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
            return this;
        }
        f(i2, 2, 0, i2, 1, 0, 0.5f);
        return this;
    }

    public d h(int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        m(1, i2, i3, i4);
        m(2, i5, i6, i7);
        this.a.G = f2;
        return this;
    }

    public d i(int i2) {
        if (i2 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
            return this;
        }
        f(i2, 7, 0, i2, 6, 0, 0.5f);
        return this;
    }

    public d j(int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        m(6, i2, i3, i4);
        m(7, i5, i6, i7);
        this.a.G = f2;
        return this;
    }

    public d k(int i2) {
        if (i2 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
            return this;
        }
        f(i2, 4, 0, i2, 3, 0, 0.5f);
        return this;
    }

    public d l(int i2, int i3, int i4, int i5, int i6, int i7, float f2) {
        m(3, i2, i3, i4);
        m(4, i5, i6, i7);
        this.a.H = f2;
        return this;
    }

    public d m(int i2, int i3, int i4, int i5) {
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    ConstraintLayout.b bVar = this.a;
                    bVar.e = i3;
                    bVar.f = -1;
                } else if (i4 == 2) {
                    ConstraintLayout.b bVar2 = this.a;
                    bVar2.f = i3;
                    bVar2.e = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + K(i4) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.a).leftMargin = i5;
                return this;
            case 2:
                if (i4 == 1) {
                    ConstraintLayout.b bVar3 = this.a;
                    bVar3.g = i3;
                    bVar3.h = -1;
                } else if (i4 == 2) {
                    ConstraintLayout.b bVar4 = this.a;
                    bVar4.h = i3;
                    bVar4.g = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.a).rightMargin = i5;
                return this;
            case 3:
                if (i4 == 3) {
                    ConstraintLayout.b bVar5 = this.a;
                    bVar5.i = i3;
                    bVar5.j = -1;
                    bVar5.m = -1;
                    bVar5.n = -1;
                    bVar5.f17o = -1;
                } else if (i4 == 4) {
                    ConstraintLayout.b bVar6 = this.a;
                    bVar6.j = i3;
                    bVar6.i = -1;
                    bVar6.m = -1;
                    bVar6.n = -1;
                    bVar6.f17o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.a).topMargin = i5;
                return this;
            case 4:
                if (i4 == 4) {
                    ConstraintLayout.b bVar7 = this.a;
                    bVar7.l = i3;
                    bVar7.k = -1;
                    bVar7.m = -1;
                    bVar7.n = -1;
                    bVar7.f17o = -1;
                } else if (i4 == 3) {
                    ConstraintLayout.b bVar8 = this.a;
                    bVar8.k = i3;
                    bVar8.l = -1;
                    bVar8.m = -1;
                    bVar8.n = -1;
                    bVar8.f17o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                ((ViewGroup.MarginLayoutParams) this.a).bottomMargin = i5;
                return this;
            case 5:
                if (i4 == 5) {
                    ConstraintLayout.b bVar9 = this.a;
                    bVar9.m = i3;
                    bVar9.l = -1;
                    bVar9.k = -1;
                    bVar9.i = -1;
                    bVar9.j = -1;
                } else if (i4 == 3) {
                    ConstraintLayout.b bVar10 = this.a;
                    bVar10.n = i3;
                    bVar10.l = -1;
                    bVar10.k = -1;
                    bVar10.i = -1;
                    bVar10.j = -1;
                } else if (i4 == 4) {
                    ConstraintLayout.b bVar11 = this.a;
                    bVar11.f17o = i3;
                    bVar11.l = -1;
                    bVar11.k = -1;
                    bVar11.i = -1;
                    bVar11.j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                this.a.D = i5;
                return this;
            case 6:
                if (i4 == 6) {
                    ConstraintLayout.b bVar12 = this.a;
                    bVar12.t = i3;
                    bVar12.s = -1;
                } else if (i4 == 7) {
                    ConstraintLayout.b bVar13 = this.a;
                    bVar13.s = i3;
                    bVar13.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                this.a.setMarginStart(i5);
                return this;
            case 7:
                if (i4 == 7) {
                    ConstraintLayout.b bVar14 = this.a;
                    bVar14.v = i3;
                    bVar14.u = -1;
                } else if (i4 == 6) {
                    ConstraintLayout.b bVar15 = this.a;
                    bVar15.u = i3;
                    bVar15.v = -1;
                } else {
                    throw new IllegalArgumentException("right to " + K(i4) + " undefined");
                }
                this.a.setMarginEnd(i5);
                return this;
            default:
                throw new IllegalArgumentException(K(i2) + " to " + K(i4) + " unknown");
        }
    }

    public d n(int i2) {
        this.a.Q = i2;
        return this;
    }

    public d o(int i2) {
        this.a.P = i2;
        return this;
    }

    public d p(int i2) {
        ((ViewGroup.MarginLayoutParams) this.a).height = i2;
        return this;
    }

    public d q(int i2) {
        this.a.U = i2;
        return this;
    }

    public d r(int i2) {
        this.a.T = i2;
        return this;
    }

    public d s(int i2) {
        this.a.S = i2;
        return this;
    }

    public d t(int i2) {
        this.a.R = i2;
        return this;
    }

    public d u(int i2) {
        ((ViewGroup.MarginLayoutParams) this.a).width = i2;
        return this;
    }

    public d v(String str) {
        this.a.I = str;
        return this;
    }

    public d w(float f2) {
        this.b.setElevation(f2);
        return this;
    }

    public d x(int i2, int i3) {
        switch (i2) {
            case 1:
                this.a.w = i3;
                return this;
            case 2:
                this.a.y = i3;
                return this;
            case 3:
                this.a.x = i3;
                return this;
            case 4:
                this.a.z = i3;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.a.A = i3;
                return this;
            case 7:
                this.a.B = i3;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public d y(float f2) {
        this.a.G = f2;
        return this;
    }

    public d z(int i2) {
        this.a.N = i2;
        return this;
    }
}
