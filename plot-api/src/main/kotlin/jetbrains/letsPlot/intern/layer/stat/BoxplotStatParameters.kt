/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.stat

import jetbrains.datalore.plot.base.stat.BoxplotStat
import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.OptionsCapsule

interface BoxplotStatParameters : OptionsCapsule {
    val varWidth: Boolean?

    @Suppress("SpellCheckingInspection")
    val coef: Number?  // Whisker IQR ratio

    override fun seal() = Options.of(
        BoxplotStat.P_VARWIDTH to varWidth,
        BoxplotStat.P_COEF to coef
    )
}
