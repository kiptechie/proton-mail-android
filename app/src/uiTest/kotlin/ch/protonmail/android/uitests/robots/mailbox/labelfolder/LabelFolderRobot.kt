/*
 * Copyright (c) 2020 Proton Technologies AG
 * 
 * This file is part of ProtonMail.
 * 
 * ProtonMail is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * ProtonMail is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with ProtonMail. If not, see https://www.gnu.org/licenses/.
 */
package ch.protonmail.android.uitests.robots.mailbox.labelfolder

import ch.protonmail.android.R
import ch.protonmail.android.uitests.robots.mailbox.MailboxRobotInterface
import ch.protonmail.android.uitests.testsHelper.UIActions

/**
 * [LabelFolderRobot] class implements [MailboxRobotInterface],
 * contains actions and verifications for Labels or Folders mailbox functionality.
 */
class LabelFolderRobot : MailboxRobotInterface {

    /**
     * Contains all the validations that can be performed by [LabelFolderRobot].
     */
    open class Verify {

        fun messageMoved(messageSubject: String) {
            UIActions.wait.forViewWithIdAndText(R.id.messageTitleTextView, messageSubject)
        }
    }

    inline fun verify(block: Verify.() -> Unit) = Verify().apply(block)
}