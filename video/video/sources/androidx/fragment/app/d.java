package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import o.ViewTreeObserver$OnPreDrawListenerC10826xv1;
import o.XL1;

/* loaded from: classes.dex */
public class d {
    public static int a(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.Q();
            }
            return fragment.S();
        } else if (z) {
            return fragment.w();
        } else {
            return fragment.z();
        }
    }

    public static a b(Context context, Fragment fragment, boolean z, boolean z2) {
        int M = fragment.M();
        int a2 = a(fragment, z, z2);
        fragment.e2(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.C1;
        if (viewGroup != null) {
            int i = XL1.c.c;
            if (viewGroup.getTag(i) != null) {
                fragment.C1.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.C1;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation O0 = fragment.O0(M, z, a2);
        if (O0 != null) {
            return new a(O0);
        }
        Animator P0 = fragment.P0(M, z, a2);
        if (P0 != null) {
            return new a(P0);
        }
        if (a2 == 0 && M != 0) {
            a2 = d(context, M, z);
        }
        if (a2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a2);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e2) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a2);
                    if (loadAnimation2 != null) {
                        return new a(loadAnimation2);
                    }
                } else {
                    throw e2;
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i, boolean z) {
        if (i != 4097) {
            if (i != 8194) {
                if (i != 8197) {
                    if (i != 4099) {
                        if (i != 4100) {
                            return -1;
                        }
                        if (z) {
                            return c(context, 16842936);
                        }
                        return c(context, 16842937);
                    } else if (z) {
                        return XL1.b.c;
                    } else {
                        return XL1.b.d;
                    }
                } else if (z) {
                    return c(context, 16842938);
                } else {
                    return c(context, 16842939);
                }
            } else if (z) {
                return XL1.b.a;
            } else {
                return XL1.b.b;
            }
        } else if (z) {
            return XL1.b.e;
        } else {
            return XL1.b.f;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public final Animation a;
        public final Animator b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup X;
        public final View Y;
        public boolean Y0;
        public boolean Z;
        public boolean Z0;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.Z0 = true;
            this.X = viewGroup;
            this.Y = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.Z0 = true;
            if (this.Z) {
                return !this.Y0;
            }
            if (!super.getTransformation(j, transformation)) {
                this.Z = true;
                ViewTreeObserver$OnPreDrawListenerC10826xv1.a(this.X, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.Z && this.Z0) {
                this.Z0 = false;
                this.X.post(this);
                return;
            }
            this.X.endViewTransition(this.Y);
            this.Y0 = true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.Z0 = true;
            if (this.Z) {
                return !this.Y0;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.Z = true;
                ViewTreeObserver$OnPreDrawListenerC10826xv1.a(this.X, this);
            }
            return true;
        }
    }
}
