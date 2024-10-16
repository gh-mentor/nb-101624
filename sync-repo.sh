# This bash script uses git to sync changes between a local and remote GitHub repository on branch 'main'.

# Steps: 
# - print message 'Synced changes with remote repository'
# - pull changes from remote repository
# - stage all changes
# - commit changes with message 'Updated'
# - push changes to remote repository on branch 'main'.

# Print message 'Synced changes with remote repository'
echo "Synced changes with remote repository"

# Pull changes from remote repository
git pull origin main

# Stage all changes
git stage .

# Commit changes with message 'Updated'
git commit -m "Updated"

# Push changes to remote repository on branch 'main'
git push origin main

